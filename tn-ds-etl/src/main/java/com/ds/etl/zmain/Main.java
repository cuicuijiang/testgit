package com.ds.etl.zmain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ds.etl.model.CarrierGroup;


public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-etl.xml");
		
		CarrierGroup<?> carrierGroup = (CarrierGroup<?>) ctx.getBean(args[0]);
		if (args.length >= 3) {
			carrierGroup.setCarrierGroupBatchSize(Long.valueOf(args[1]));
			carrierGroup.setCarrierBatchSize(Long.valueOf(args[2]));
		}
		
		carrierGroup.carry();
		ctx.close();
	}
}
