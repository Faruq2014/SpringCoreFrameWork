package com.mollaConstructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpolyeeApp {

	public static void main(String[] args) {
	ApplicationContext contex= new ClassPathXmlApplicationContext("ConstructorDI.xml");
	Employee emp1=contex.getBean("Faruq", Employee.class);
	emp1.display();
	
	Employee emp2=contex.getBean("Khaled", Employee.class);
	emp2.display();


	}

}
