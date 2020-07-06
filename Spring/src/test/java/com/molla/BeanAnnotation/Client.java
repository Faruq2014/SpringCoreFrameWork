package com.molla.BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

			ApplicationContext context= new AnnotationConfigApplicationContext(SchoolConfig.class);
			
			System.out.println("configuration is fine");
			School  skol=context.getBean("High School",School.class);
		     System.out.println("skol object created "+skol);
		     skol.test();
		     ((AnnotationConfigApplicationContext)context).close(); // ApplicationContext is a interface, casting
		     
		     // AnnotationConfigApplicationContext   is a class of  ApplicationContext
		     //or
		   //  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SchoolConfig.class);
		    // context.close();
	}

}
