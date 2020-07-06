package com.mollaCommonDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentScoreApp {

	public static void main(String[] args) {
		
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("CommonDI.xml");
		System.out.println("Alhamdulillah");
		StudentOne stu1=contex.getBean("Faruq", StudentOne.class);
		stu1.studentScore();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		StudentTwo stu2=contex.getBean("Khaled", StudentTwo.class);
		stu2.studentScore();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		StudentThree stu3=contex.getBean("Shahin", StudentThree.class);
		stu3.studentScore();
	}

}
