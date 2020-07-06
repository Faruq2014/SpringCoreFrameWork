package com.mollaContex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
    ApplicationContext contex= new ClassPathXmlApplicationContext("Contex.xml");
    System.out.println("config loaded");
				Vechile obj=(Vechile) contex.getBean("vechile");
		         obj.drive();
		         
		         
		//Bike bk=new Bike();
		//bk.drive();
	}

}
