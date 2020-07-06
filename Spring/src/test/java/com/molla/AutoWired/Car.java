package com.molla.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("AutoWired.xml");
	DashBoard  OperationAC=context.getBean("DashBoard",DashBoard.class);
	OperationAC.temperature();
	}

}
