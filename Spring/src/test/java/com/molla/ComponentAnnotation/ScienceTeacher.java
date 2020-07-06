package com.molla.ComponentAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
	@Value("${scienceTeacher.Name}")
	private String teacherName;
	
	@Override
	public void info() {
		System.out.println("Hello, My name is " +teacherName);
		System.out.println("Iam your science teacher");	
	}
	@Override
	public void teach() {
		System.out.println("This is your syllabus.");
	}

	@Override
	public void organize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		
	}

	

}
