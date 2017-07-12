/**
 * 
 */
package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.Scene;

/**
 * @author zhangqingli
 *
 */
@Repository
public class SceneMysqlDao extends CreditVettingBaseDao<Scene> {
	{
		tableName = "b_scene";
		primaryIdName = "scene_id";
	}
}
