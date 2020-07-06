package com.molla.Bean_LifeCycle_Annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ApplicationContext context= new ClassPathXmlApplicationContext("Bean_LifeCycle.xml");
	Student_Name stu=context.getBean("studentDB" , Student_Name.class);
	stu.selectNameInfo();
	stu.seletPhone();
	//((AbstractApplicationContext)context).close();
	((ClassPathXmlApplicationContext)context).close();
	}

}
