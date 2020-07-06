package com.molla.ValuesRequiredPropertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

			ApplicationContext context= new ClassPathXmlApplicationContext("Properties.xml");
			Operator  stu=context.getBean("student123", Operator.class);
			stu.Operation();
		
	}

}
