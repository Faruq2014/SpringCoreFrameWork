package com.molla.ComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

			ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
			System.out.println("configuration is fine");
			College  coll=context.getBean("SA Gov College",College.class);
		     System.out.println("college object created "+coll);
		     coll.method1();
		   //  ((ApplicationContext)context.cl
	}

}
