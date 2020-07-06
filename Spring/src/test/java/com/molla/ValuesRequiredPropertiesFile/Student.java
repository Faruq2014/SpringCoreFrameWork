package com.molla.ValuesRequiredPropertiesFile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private String interestedCourse;
	private String hobby;

	/* literal value : Three ways we can import literal value from properties file
	 * 1. from xml file =  <property name="name" value="${student.name}"/>
	 * 2.Directly from the source code=//@Value("Faruq")
	 * 3. by @value annotaion=@Value("${student.name}")
	 * 
	 * */
	@Required //thats mean it is mandatory field. looks like this method is deprecated.
	//@Value("Faruq")
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	//@Value("Java")
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	//@Value("Soccer")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name: "+name);
		System.out.println("Student interested Course: "+interestedCourse);
		System.out.println("Student hobby: "+hobby);
	}
	
}
