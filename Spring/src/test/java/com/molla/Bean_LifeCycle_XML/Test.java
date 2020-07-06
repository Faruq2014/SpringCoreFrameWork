package com.molla.Bean_LifeCycle_XML;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	ApplicationContext context= new ClassPathXmlApplicationContext("Bean_LifeCycleXML.xml");
	System.out.println(">>>>>>>>>>Student_Name Class start here<<<<<<<<<<<<<<<<<<<");
	Student_Name stu=context.getBean("studentDB" , Student_Name.class);
	stu.selectNameInfo();
	stu.seletPhone();
	((ClassPathXmlApplicationContext)context).registerShutdownHook();
	System.out.println(">>>>>>>>>>Course Class start here<<<<<<<<<<<<<<<<<<<");
	Student_Course stu1=context.getBean("studentDB1" , Student_Course.class);
	stu1.selectCourseInfo();
	stu1.seletStudentCourse();
	
	System.out.println(">>>>>>>>>>Session Class start here<<<<<<<<<<<<<<<<<<<");
	Student_Session stu2=context.getBean("studentDB2" , Student_Session.class);
	stu2.selectSessionInfo();
	stu2.seletSessionFee();
	
	System.out.println(">>>>>>>>>>Session Class start here<<<<<<<<<<<<<<<<<<<");
	Student_Tution stu3=context.getBean("studentDB3" , Student_Tution.class);
	stu3.seletSummerFee();
	stu3.seletfallFee();
	stu3.seletwinterFee();
	
	//((AbstractApplicationContext)context).close();
	//((ClassPathXmlApplicationContext)context).close();
	}

}
