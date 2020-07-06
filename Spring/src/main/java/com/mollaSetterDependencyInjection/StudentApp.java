package com.mollaSetterDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		
		  ApplicationContext contex =new
		  ClassPathXmlApplicationContext("SetterDI.xml");
		  System.out.println("Alhamdulillah"); Student stu=contex.getBean("Faruq",
		  Student.class); stu.display(); Student stu1=contex.getBean("khaled",
		  Student.class); stu1.display();
		 

	}

}
