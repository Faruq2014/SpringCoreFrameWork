package com.mollaClassDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentScoreApp {

	public static void main(String[] args) {
		
		/*
		 * Student stu= new Student(); MathScore ms=new MathScore();
		 * stu.setMathscore(ms); stu.studentScore();
		 */
		ApplicationContext contex = new ClassPathXmlApplicationContext("ClassDI.xml");
		System.out.println("Alhamdulillah");
		StudentOne stu1=contex.getBean("Faruq", StudentOne.class);
		stu1.studentScore();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		StudentTwo stu2=contex.getBean("Khaled", StudentTwo.class);
		stu2.studentScore();
	}

}
