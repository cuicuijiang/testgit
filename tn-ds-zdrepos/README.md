# 同牛数据仓库项目参考文档



### 源码获取：

[Bitbucket Server](http://zhangqingli@jira.newbenben.com:7991/scm/risk/tn-etl.git) <br>
[Maven Server](http://192.168.1.121:9090/nexus/content/repositories/releases/com/keyllo/ds/tn-ds-zdrepos/0.0.1-RELEASE/tn-ds-zdrepos-0.0.1-RELEASE-sources.jar) <br><br>


### 项目背景：

同牛数仓是原信审、反欺诈、数据源等项目的衍生项目，针对原来项目中数据模型和数据存取中存在的一些问题，如：

* 大部分数据都存储在阿里云mysql单主机上，单节点压力较大
* 出于业务进度因素考虑，部分业务数据模型细节设计不太合理
* 所有的业务数据都采用mysql单表存取，虽然在一定程度上减少了mysql维护表间关系的消耗，但这种[非]标准化（NF & JPA）的设计同时大大增加了数据和应用程序的维护成本
* 单表部分关键字段没有查询索引，查询速度较慢

针对以上问题，本部门决定建立以mongodb存储为核心的数据仓库，以分担mysql单节点存储服务器的压力。<br>
<br>



### 功能特点

* 数据仓库以mongodb存储为核心，抽数来源主要是原mysql业务数据（包括信审、反欺诈、数据源等），部分数据来源于mongodb（e.g. b_t_call）

* 在开发效率和抽数效率间折中考虑，本项目采用 `spring jdbc` 和 `spring data mongodb` 作为DAO模型

* 为尽可能提高抽数效率，本项目采用多线程的设计方式，将数据传输任务进行分组，一类数据传输任务被分到同一组，一个分组的数据传输任务对应一个后台进程，分组的任务又由多个子任务（对应一个线程）构成，组任务的批处理量及其子任务的个数及批处理量可以设置

* 支持定量抽数。e.g. 查询mongodb当前的lastestId 为 1000000，则下次抽取数据可以设置从 application_id  [1000000, 1500000] 区间进行数据抽取

* 支持定时抽数。e.g. 定时任务设置为每周一上午 10:00:00 执行，第一次抽数进行到mysql lastestId为止；下一次抽数进行之前，mysql业务数据从lastestId处增加了一部分，第二次定时任务开始时会自动获取上一次抽数截止游标（mongodb lastestId），从上次截止游标处（不包含游标处数据）开始抽数，到mysql lastestId截止，…，这样就可以实现数据的自动化抽取(E)、转换(T)、加载(L)。

  ​


### 核心组件

<img src="http://jira.newbenben.com:7991/projects/RISK/repos/tn-etl/raw/doc/zdrepos-project-desc-01.png?at=refs%2Fheads%2Fmaster" width="300px"/>



* 数据源（datasurce）
* 数据抽取器（extracter）
* 数据转换器（transformer）
* 数据加载器（loader）
* 游标（idRange）
* 数据搬运组（carrierGroup）
* 数据搬运者（carrier）
* 定时任务管理器（quartzManager）

<br>



**数据源**

Mysql数据源（采用druid）

```xml
<bean id="creditvettingDatasource" class="com.repos.utils.MyDruidDataSource" init-method="init" destroy-method="close">
	<property name="driverClassName">
		<value>${creditvetting.mysql.jdbc.driver}</value>
	</property>
	<property name="url">
		<value>${creditvetting.mysql.jdbc.url}</value>
	</property>
	<property name="username">
		<value>${creditvetting.mysql.jdbc.user}</value>
	</property>
	<property name="password">
		<value>${creditvetting.mysql.jdbc.pwd}</value>
	</property>
	<property name="initialSize" value="${creditvetting.mysql.druid.initialSize}" />
	<property name="minIdle" value="${creditvetting.db.druid.minIdle}" />
	<property name="maxActive" value="${creditvetting.db.druid.maxActive}" />
	<property name="maxWait" value="${creditvetting.db.druid.maxWait}" />
	<property name="timeBetweenEvictionRunsMillis" value="60000" />
	<property name="minEvictableIdleTimeMillis" value="300000" />
	<property name="validationQuery" value="SELECT 'x'" />
	<property name="testWhileIdle" value="true" />
	<property name="testOnBorrow" value="false" />
	<property name="testOnReturn" value="false" />
	<property name="filters" value="stat" />
</bean>
```

MongoDB数据源

```xml
<mongo:mongo id="mongo" replica-set="${mongo.replicaSet}">
        <mongo:options  
        connections-per-host="${mongo.connectionsPerHost}"  
        threads-allowed-to-block-for-connection-multiplier="${mongo.threadsAllowedToBlockForConnectionMultiplier}"  
        connect-timeout="${mongo.connectTimeout}"   
        max-wait-time="${mongo.maxWaitTime}"  
        auto-connect-retry="${mongo.autoConnectRetry}"   
        socket-keep-alive="${mongo.socketKeepAlive}"  
        socket-timeout="${mongo.socketTimeout}"  
        slave-ok="${mongo.slaveOk}"  
        write-number="${mongo.writeNumber}"  
        write-timeout="${mongo.writeTimeout}"  
        write-fsync="${mongo.writeFsync}"/>
</mongo:mongo>
```

pom数据源参数加载：

```xml
<!-- 环境管理 -->
<profiles>
	<!-- 开发环境 -->
	<profile>
		<id>dev</id>
		<activation>
			<activeByDefault>true</activeByDefault>
		</activation>
		<properties>
			<!-- 信审系统（线上，外网） -->
			<creditvetting.db.driver>com.mysql.jdbc.Driver</creditvetting.db.driver>
			<creditvetting.db.host>114.55.2.161</creditvetting.db.host>
			<creditvetting.db.port>8066</creditvetting.db.port>
			<creditvetting.db.dbname>credit_vetting</creditvetting.db.dbname>
			<creditvetting.db.username>rou_credit_vetting</creditvetting.db.username>
			<creditvetting.db.pwd>p6gAM2B085j82773</creditvetting.db.pwd>
			<creditvetting.db.druid.initialSize>30</creditvetting.db.druid.initialSize>
			<creditvetting.db.druid.minIdle>5</creditvetting.db.druid.minIdle>
			<creditvetting.db.druid.maxActive>30</creditvetting.db.druid.maxActive>
			<creditvetting.db.druid.maxWait>600000</creditvetting.db.druid.maxWait>
			
			<!-- mongodb -->
			<mongo.replicaSet>192.168.1.121:27017</mongo.replicaSet>
          	<!--数仓库-->
			<datarepos.username>datarepos</datarepos.username>
			<datarepos.password>tn123456</datarepos.password>
			<!--信审库-->
            <creditvetting.username>creditvetting</creditvetting.username>
			<creditvetting.password>tn123456</creditvetting.password>
		</properties>
	</profile>
	
	<!--生产环境(具体参数请运维同学协助) -->
	<profile>
		<id>product</id>
		<activation>
			<activeByDefault>false</activeByDefault>
		</activation>
		<properties>
			<!-- 信审系统（线上，内网） -->
			<creditvetting.db.driver>com.mysql.jdbc.Driver</creditvetting.db.driver>
			<creditvetting.db.host>rr-bp1190lr0vk21hhur.mysql.rds.aliyuncs.com</creditvetting.db.host>
			<creditvetting.db.port>3306</creditvetting.db.port>
			<creditvetting.db.dbname>credit_vetting</creditvetting.db.dbname>
			<creditvetting.db.username>vetting_migrate</creditvetting.db.username>
			<creditvetting.db.pwd>gAt50Nk5</creditvetting.db.pwd>
			<creditvetting.db.druid.initialSize>30</creditvetting.db.druid.initialSize>
			<creditvetting.db.druid.minIdle>5</creditvetting.db.druid.minIdle>
			<creditvetting.db.druid.maxActive>30</creditvetting.db.druid.maxActive>
			<creditvetting.db.druid.maxWait>600000</creditvetting.db.druid.maxWait>
			
			<!-- mongodb -->
			<mongo.replicaSet>dds-bp18d268e40177a41.mongodb.rds.aliyuncs.com:3717,dds-bp18d268e40177a42.mongodb.rds.aliyuncs.com:3717</mongo.replicaSet>
            <!--数仓库-->
			<datarepos.username>datarepos</datarepos.username>
			<datarepos.password>Y7N8S463</datarepos.password>
            <!--信审库-->
          	<creditvetting.username>creditvetting</creditvetting.username>
			<creditvetting.password>Y7N8S463</creditvetting.password>
		</properties>
	</profile>
</profiles>
```
<br>




**数据抽取器、转换器、加载器**

```java
/**
 * 数据抽提器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Extracter<T, ID> {
	/**
	 * 获取最后一个ID
	 */
	ID getLastestId();
	
	/**
	 * extract方法
	 * @param id
	 * @return
	 */
	T extract(ID id);
	
	/**
	 * 默认extract方法实现
	 * @param start
	 * @param end
	 * @return
	 */
	default List<T> extract(ID start, ID end) {
		// TODO STH IN IMPLEMENTS CLASS
		return null;
	}
}


/**
 * 数据转换器
 * @author zhangqingli
 * @param <S>
 * @param <T>
 */
public interface Transformer<S, T> {
	T trans(S s);
}


/**
 * 数据加载器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Loader<T> {
	/**
	 * load方法
	 * @param t
	 * @return
	 */
	T load(T t);
	
	/**
	 * 默认加载方法
	 * @param t
	 * @return
	 */
	default List<T> load(List<T> ts) {
		// TODO STH IN IMPLEMENTS CLASS
		return null;
	}
	
	Long getLastestId();
}
```
<br>


**游标、搬运组、搬运者**

```java
// 游标
//com.repos.integration.etl.IdRange
  
// 搬运组
//com.repos.integration.etl.CarrierGroup<T>

// 搬运者
//com.repos.integration.etl.CarrierCallable<T>
```
<br>



**定时任务管理器**

```xml
<bean id="quartzManager" class="com.repos.quartz.QuartzManager">
	<property name="stdScheduler" ref="stdScheduler"/>
</bean>
<bean id="stdScheduler" class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
	<property name="applicationContextSchedulerContextKey" value="applicationContext"/>
</bean>
```
<br>



### 使用介绍

**打包项目**

```shell
# 开发环境prfileId为dev，生产环境profileId为product 
clean install -Dmaven.test.skip=true -P dev
```

打包之后在target文件夹下面生成目标jar包（e.g. tn-ds-zdrepos-0.0.1-RELEASE.jar，0.0.1-RELEASE为项目版本号），将目标jar包scp到服务器目标目录（e.g. /opt/ds/etl）<br><br>



**运行项目**

定量抽取模式（选取一个对应的shell执行）

```shell
# 后台进程执行项目，项目执行过程中产生的日志输出到当前目录的 etl.log文件中
nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -DendId=50 -DcarrierGroupBatchSize=12 -DcarrierBatchSize=4 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -DendId=50 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

# 参数说明
# carrierGroupBean: 搬运组对象 spring beanId
# startId: 从数据表主键的startId处（包含）开始数据抽取(默认为1)
# endId: 到数据表主键的endId处（包含）结束数据抽取(默认为数据表的lastestId，即最新自增主键值)
# carrierGroupBatchSize: 数据搬运组进程一次处理的数据量(默认为1000，前1000条数据处理完成后，再处理下1000条数据)
# carrierBatchSize: 每个数据搬运线程处理的数据量(默认为250，如果carrierGroupBatchSize为默认的1000，则将会有 1000/250=4 个线程同时抽数)
```
<br>



定时抽取模式

```shell
nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DcarrierGroupBatchSize=20 -DcarrierBatchSize=5 -DjobClass="com.repos.quartz.LoanApplicationCarrierGroupJob" -Dcron="0 15 10 ? * MON" -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DjobClass="com.repos.quartz.LoanApplicationCarrierGroupJob" -Dcron="0 15 10 ? * MON" -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &

# 参数说明
# jobClass: 任务类
# cron: 定时任务cron表达式(e.g. 0 15 10 ? * MON 表示每周一上午 10:15:00 开始执行)
```
<br>



### Mongodb数据示例

更多示例请参考测试环境 [mongodb](192.168.1.121:27017/datarepos)

```json
{
    "_id" : "11698013545798042048",
    "_class" : "com.repos.model.creditvetting.LoanApplication",
    "applicationId" : NumberLong(200),
    "sceneApplyId" : "00200",
    "sceneId" : NumberLong(100010),
    "customerId" : NumberLong(200),
    "applyLoanAmount" : 5000.0,
    "applyLoanTerm" : 6,
    "applyDate" : ISODate("2016-12-30T08:14:10.000Z"),
    "applicationStatus" : "200513",
    "checkFlag" : 10,
    "resultCheckFlag" : 2,
    "resultRemark" : "超时自动拒绝",
    "contractSign" : 1,
    "antifraudResultJson" : "xxx",
            "result_address_detect" : {
                "userInfoId" : 200,
                "address_detect" : "{\"bank_card_address\":\"北京市工商银行\",\"id_card_address\":\"山东省潍坊市昌乐县\",\"mobile_address\":\"山东省潍坊市\",\"true_ip_address\":\"山东省潍坊市\"}",
                "id_card_address" : "山东省潍坊市昌乐县",
                "mobile_address" : "山东省潍坊市",
                "true_ip_address" : "山东省潍坊市",
                "bank_card_address" : "北京市工商银行"
            },
            "result_geo_ip" : {
                "userInfoId" : 200,
                "geo_ip" : "{\"city\":\"潍坊市\",\"country\":\"中国\",\"county\":\"\",\"ip\":\"111.37.41.163\",\"isp\":\"移动\",\"latitude\":36.70925,\"lip\":1864706467,\"longitude\":119.10708,\"province\":\"山东省\"}",
                "ip" : "111.37.41.163",
                "lip" : NumberLong(1864706467),
                "country" : "中国",
                "province" : "山东省",
                "city" : "潍坊市",
                "county" : "",
                "isp" : "移动",
                "latitude" : 36.70925,
                "longitude" : 119.10708
            },
            "result_risk_items" : [ 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498536,
                    "item_name" : "身份证命中中风险关注名单",
                    "risk_level" : "low",
                    "group" : "不良信息扫描",
                    "item_detail" : "{\"namelist_hit_details\":[{\"hit_type_displayname\":\"借款人身份证\",\"fraud_type\":\"异常借款\",\"description\":\"身份证命中中风险关注名单\",\"type\":\"grey_list\"}],\"fraud_type\":\"异常借款\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498538,
                    "item_name" : "身份证命中低风险关注名单",
                    "risk_level" : "low",
                    "group" : "不良信息扫描",
                    "item_detail" : "{\"namelist_hit_details\":[{\"hit_type_displayname\":\"借款人身份证\",\"fraud_type\":\"机构代办\",\"description\":\"身份证命中中风险关注名单\",\"type\":\"grey_list\"}],\"fraud_type\":\"机构代办\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498568,
                    "item_name" : "手机号命中中风险关注名单",
                    "risk_level" : "low",
                    "group" : "不良信息扫描",
                    "item_detail" : "{\"namelist_hit_details\":[{\"hit_type_displayname\":\"借款人手机\",\"fraud_type\":\"异常借款\",\"description\":\"手机号命中中风险关注名单\",\"type\":\"grey_list\"}],\"fraud_type\":\"异常借款\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498570,
                    "item_name" : "手机号命中低风险关注名单",
                    "risk_level" : "low",
                    "group" : "不良信息扫描",
                    "item_detail" : "{\"namelist_hit_details\":[{\"hit_type_displayname\":\"借款人手机\",\"fraud_type\":\"机构代办\",\"description\":\"手机号命中低风险关注名单\",\"type\":\"grey_list\"}],\"fraud_type\":\"机构代办\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498630,
                    "item_name" : "3个月内申请信息关联多个身份证",
                    "risk_level" : "low",
                    "group" : "客户行为检测",
                    "item_detail" : "{\"frequency_detail_list\":[{\"data\":[\"xxxxa\":[\"370725199009090429\",\"1427※※※※※※※※※※183x\"],\"detail\":\"3个月手机号关联身份证数：2\"}],\"type\":\"frequency_detail\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498632,
                    "item_name" : "3个月内银行卡_姓名关联多个身份证",
                    "risk_level" : "high",
                    "group" : "客户行为检测",
                    "item_detail" : "{\"frequency_detail_list\":[{\"data\":[\"370725199009090429\",\"9707※※※※※※※※※※0429\"],\"detail\":\"3个月内银行卡_姓名关联多个身份证：2\"}],\"type\":\"frequency_detail\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498662,
                    "item_name" : "7天内申请人在多个平台申请借款",
                    "risk_level" : "high",
                    "group" : "多平台借贷申请检测",
                    "item_detail" : "{\"platform_detail_dimension\":[{\"count\":5,\"detail\":[\"互联网金融门户:1\",\"一般消费分期平台:1\",\"P2P网贷:3\"],\"dimension\":\"借款人手机详情\"},{\"count\":5,\"detail\":[\"互联网金融门户:1\",\"一般消费分期平台:1\",\"P2P网贷:3\"],\"dimension\":\"借款人身份证详情\"}],\"platform_detail\":[\"互联网金融门户:1\",\"一般消费分期平台:1\",\"P2P网贷:3\"],\"platform_count\":5,\"type\":\"platform_detail\"}"
                }, 
                {
                    "userInfoId" : 200,
                    "risk_items" : "xxx",
                    "item_id" : 2498664,
                    "item_name" : "1个月内申请人在多个平台申请借款",
                    "risk_level" : "medium",
                    "group" : "多平台借贷申请检测",
                    "item_detail" : "{\"platform_detail_dimension\":[{\"count\":14,\"detail\":[\"一般消费分期平台:2\",\"互联网金融门户:1\",\"理财机构:1\",\"P2P网贷:9\",\"大型消费金融公司:1\"],\"dimension\":\"借款人手机详情\"},{\"count\":16,\"detail\":[\"一般消费分期平台:2\",\"互联网金融门户:1\",\"信用卡中心:1\",\"理财机构:1\",\"P2P网贷:10\",\"大型消费金融公司:1\"],\"dimension\":\"借款人身份证详情\"}],\"platform_detail\":[\"一般消费分期平台:2\",\"互联网金融门户:1\",\"信用卡中心:1\",\"理财机构:1\",\"P2P网贷:10\",\"大型消费金融公司:1\"],\"platform_count\":16,\"type\":\"platform_detail\"}"
                }, 
				...
            ]
        }
    },
    "scene" : {
        "sceneId" : NumberLong(100010),
        "sceneName" : "现金贷",
        "sceneType" : "",
        "loanType" : 2,
        "statusFlag" : 1,
        "antiFraud" : "201504",
        "scoreFlag" : "201501",
        "creditFlag" : "201502",
        "whiteListRule" : 0,
        "encryptKey" : {
            "_id" : NumberLong(1),
            "sceneId" : NumberLong(100010),
            "privateKeyName" : "taicredit_private_key.pem",
            "rsaPublicKeyName" : "taicredit_public_key.pem",
            "privateKeyPkcs8Name" : "taicredit_private_key_pkcs8.pem",
            "keyFlag" : 1
        }
    },
    "telLogin" : {
        "_id" : NumberLong(365),
        "taskId" : "TASKYYS00000314830855311501261363",
        "idcard" : "370725199009090429",
        "userName" : "xxxx",
        "userNumber" : "13853672576",
        "result" : 1,
        "remark" : "成功(数据不完整)",
        "createTime" : ISODate("2016-12-30T08:12:11.000Z"),
        "modifyTime" : ISODate("2017-03-11T04:58:02.000Z"),
        "telBasicInfo" : {
            "_id" : NumberLong(138),
            "idcard" : "xxxx",
            "userName" : "xx静",
            "certAddr" : "",
            "userLvl" : "3",
            "mobileStatus" : "正常",
            "netAge" : "63",
            "email" : "",
            "userNumber" : "13853672576",
            "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z"),
            "telCalls" : [],
            "telMsgs" : [],
            "telPackageInfos" : [],
            "telPointInfos" : [],
            "telBillHistories" : [ 
                {
                    "_id" : NumberLong(5678),
                    "basicInfoId" : NumberLong(138),
                    "idcard" : "xxxx",
                    "userNumber" : "13853672576",
                    "accountQueryCycle" : "2016-12",
                    "accountComsume" : "98",
                    "accountItems" : "",
                    "accountFee" : "90",
                    "accountCategory" : "固定费用",
                    "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z")
                }, 
                {
                    "_id" : NumberLong(5679),
                    "basicInfoId" : NumberLong(138),
                    "idcard" : "xxxx",
                    "userNumber" : "13853672576",
                    "accountQueryCycle" : "2016-12",
                    "accountComsume" : "98",
                    "accountItems" : "",
                    "accountFee" : "0",
                    "accountCategory" : "短彩信",
                    "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z")
                }, 
                ...
            ],
            "telYd" : {
                "ydBizBusinesses" : [ 
                    {
                        "_id" : NumberLong(2964),
                        "basicInfoId" : NumberLong(138),
                        "idcard" : "xxxx",
                        "userNumber" : "13853672576",
                        "businessFee" : "",
                        "businessCategory" : "套餐",
                        "businessName" : "流量安心包",
                        "effectTime" : "2016-11-20",
                        "invalidTime" : "",
                        "queryCycle" : "",
                        "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z")
                    }, 
                    {
                        "_id" : NumberLong(2965),
                        "basicInfoId" : NumberLong(138),
                        "idcard" : "xxxx",
                        "userNumber" : "13853672576",
                        "businessFee" : "",
                        "businessCategory" : "套餐",
                        "businessName" : "【新】48元包国内主叫220分钟",
                        "effectTime" : "2016-11-20",
                        "invalidTime" : "",
                        "queryCycle" : "",
                        "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z")
                    }, 
                    {
                        "_id" : NumberLong(2966),
                        "basicInfoId" : NumberLong(138),
                        "idcard" : "xxxx",
                        "userNumber" : "13853672576",
                        "businessFee" : "",
                        "businessCategory" : "套餐",
                        "businessName" : "4G套餐-40元包国内700M数据流量",
                        "effectTime" : "2016-11-20",
                        "invalidTime" : "",
                        "queryCycle" : "",
                        "inquiryTime" : ISODate("2016-12-30T08:19:01.000Z")
                    }, 
                    ...
                ]
            },
            "telLt" : {
                "ltAccountBalances" : [],
                "ltBillHistories" : [],
                "LtPaymentRecords" : []
            },
            "telDx" : {
                "dxFlowInfoLists" : [],
                "dxPackageInfos" : [],
                "dxFamiliarityInfos" : [],
                "dxPointInfos" : [],
                "dxCreditInfos" : []
            }
        }
    },
    "customer" : {
        "customerId" : NumberLong(200),
        "sceneId" : NumberLong(100010),
        "mobileRegister" : "13853672576",
        "customerName" : "xxxx",
        "idcard" : "xxxx",
        "mobile" : "13853672576",
        "gender" : 2,
        "age" : 27,
        "education" : "",
        "bankCard" : "6212261607008672793",
        "bankName" : "工商银行",
        "email" : "",
        "bankPhone" : "13853672576",
        "address" : "山东省潍坊市昌乐县宝城街道梁庄村155号",
        "creditDate" : ISODate("2016-12-30T08:14:10.000Z"),
        "ccxScore" : 594,
        "censusRegister" : "",
        "graduatedUniversity" : "",
        "universityCity" : "",
        "mobileLocation" : "",
        "Zodiac" : "",
        "starSign" : "",
        "workplace" : "山东省潍坊市昌乐县宝石城二路1787号",
        "firstContactName" : "闫继翔",
        "firstContactRelationship" : "11003",
        "firstContactMobile" : "18753632771",
        "secondContactName" : "王晓",
        "secondContactRelationship" : "11004",
        "secondContactMobile" : "15763054030",
        "thirdContactName" : "臧坤",
        "thirdContactRelationship" : "11005",
        "thirdContactMobile" : "15205368710",
        "profession" : "4001",
        "companyName" : "圣奇工艺品有限公司",
        "companyPosition" : "",
        "companyPhone" : "0536-6281895",
        "ip" : "111.37.41.83",
        "applyAddress" : "",
        "imei" : "",
        "createDate" : ISODate("2016-12-30T08:14:08.000Z"),
        "idPictureFront" : "cbed0277cacf4b5bae7724bc8bb7baf9.jpg",
        "idPictureBack" : "09f357d9e91a4880b37bf4d2ffa6b418.jpg",
        "tgLocation" : "sdzj1",
        "customerFaceVerifies" : [ 
            {
                "faceVerifyId" : NumberLong(314857),
                "customerId" : NumberLong(200),
                "sceneVerifyId" : "552711",
                "sceneId" : NumberLong(100010),
                "requestId" : "1494848738,bfcad307-c575-4849-bee0-42325f6d2183",
                "resultFaceidJson" : "{\"confidence\":87.287,\"thresholds\":{\"1e-3\":62.169,\"1e-5\":74.399,\"1e-4\":69.315,\"1e-6\":78.038}}",
                "resultIdcardDatasourceJson" : "{\"confidence\":87.299,\"thresholds\":{\"1e-3\":62.169,\"1e-5\":74.399,\"1e-4\":69.315,\"1e-6\":78.038}}",
                "resultIdcardPhotoJson" : "",
                "data" : "{\"id_exceptions\":{\"id_photo_monochrome\":0,\"id_attacked\":0},\"face_genuineness\":{\"synthetic_face_threshold\":0.5,\"synthetic_face_confidence\":0,\"mask_confidence\":0,\"mask_threshold\":0.5},\"request_id\":\"1494848738,bfcad307-c575-4849-bee0-42325f6d2183\",\"time_used\":619,\"result_faceid\":{\"confidence\":87.287,\"thresholds\":{\"1e-3\":62.169,\"1e-5\":74.399,\"1e-4\":69.315,\"1e-6\":78.038}}}__{\"time_used\":559,\"id_exceptions\":{\"id_photo_monochrome\":0,\"id_attacked\":0},\"result_faceid\":{\"confidence\":87.299,\"thresholds\":{\"1e-3\":62.169,\"1e-5\":74.399,\"1e-4\":69.315,\"1e-6\":78.038}},\"request_id\":\"1494848709,84d9ab85-a4e9-4f02-bc86-02e6830aa9d9\"}__",
                "realImg" : "efbe282e232a4e23b50f2ca90b77f22d.jpg",
                "faceImg" : "560dbcdebd6c4f1a8a2803b91fea28a8.jpg",
                "origin" : 2,
                "createDate" : ISODate("2017-05-15T11:45:50.000Z")
            }
        ],
        "customerIdnoAuths" : [ 
            {
                "idnoAuthId" : NumberLong(314852),
                "customerId" : NumberLong(200),
                "sceneId" : 100010,
                "sceneIdnoAuthId" : "552711",
                "name" : "xxxx",
                "idno" : "xxxx",
                "race" : "汉",
                "gender" : 2,
                "frontRequestId" : "1494848708,14ef67fe-44b6-4517-8c61-5b26164c7375",
                "backRequestId" : "1494848719,997ad195-ef4a-432f-9d0f-7648cf564011",
                "birthYear" : 1990,
                "birthMonth" : 9,
                "birthDay" : 9,
                "address" : "山东省昌乐县宝城街道梁庄村155号",
                "headRect" : "a:4:{s:2:\"rt\";a:2:{s:1:\"y\";d:0.23927765000000001;s:1:\"x\";d:0.88712009999999997;}s:2:\"lt\";a:2:{s:1:\"y\";d:0.22347628999999999;s:1:\"x\";d:0.61794499999999997;}s:2:\"lb\";a:2:{s:1:\"y\";d:0.71331829999999996;s:1:\"x\";d:0.60781479999999999;}s:2:\"rb\";a:2:{s:1:\"y\";d:0",
                "issuedBy" : "昌乐县公安局",
                "validDate" : "2011.08.04-2021.08.04",
                "frontLegality" : "{\"Edited\":0,\"Photocopy\":0,\"ID Photo\":1,\"Screen\":0,\"Temporary ID Photo\":0}",
                "backLegality" : "{\"Edited\":0,\"Photocopy\":0,\"ID Photo\":1,\"Screen\":0,\"Temporary ID Photo\":0}",
                "origin" : 2,
                "createDate" : ISODate("2017-05-15T11:45:50.000Z")
            }
        ],
        "telephoneAudits" : [],
        "blackandwhiteLists" : [],
        "creditInquiries" : [ 
            {
                "inquiryId" : NumberLong(164),
                "sceneId" : 100010,
                "custName" : "xxxx",
                "mobile" : "13853672576",
                "idcard" : "xxxx",
                "bankCard" : "6212261607008672793",
                "inquiryTime" : ISODate("2016-12-30T08:14:10.000Z"),
                "ccxScore" : 594,
                "resultCode" : "0000",
                "codeName" : "处理成功",
                "resultData" : "{\"code\":\"0000\",\"factors\":{\"consumption\":\"48\",\"credithistory\":\"60\",\"identity\":\"55\",\"performance\":\"66\",\"social\":\"68\"},\"grades\":{\"consumption\":\"C\",\"credithistory\":\"CC\",\"identity\":\"C\",\"performance\":\"CCC\",\"social\":\"B\"},\"msg\":\"处理成功\",\"score\":\"594\"}"
            }
        ],
        "antifraudInquiries" : [],
        "smsAndContactses" : []
    }
}
```

<br>



### 附录

**** 

> 状态码 (com.repos.model.commons.StateCode)

**程序码**

|   enum   | code |  desc  |
| :------: | :--: | :----: |
| SYS_INIT | 0100 | 系统初始化  |
| SUCCESS  | 0200 | 数据处理成功 |
|  ERROR   | 0500 | 系统内部异常 |



**数据码**

|      enum       | code | desc |
| :-------------: | :--: | :--: |
|  DATA_IS_NOMAL  | 1200 | 数据正常 |
| DATA_IS_INVALID | 1100 | 数据无效 |
|  DATA_IS_NULL   | 1000 | 数据为空 |