package com.molla.CommonInterfaceDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myphone {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("CommonInterfaceDI.xml");
		System.out.println("Alhamdulillah");
		ServiceProvider sim = contex.getBean("Sim", ServiceProvider.class);
		sim.activeServices();	
		
		ApplicationContext contex1 = new ClassPathXmlApplicationContext("CommonInterfaceDI.xml");
		System.out.println("Alhamdulillah");
		ServiceProvider sim1 = contex1.getBean("Sim1", ServiceProvider.class);
		sim1.activeServices();	
	}

}
