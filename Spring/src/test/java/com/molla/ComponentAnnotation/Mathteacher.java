package com.molla.ComponentAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mathteacher implements Teacher{
	@Value("${mathTeacher.Name}")
	private String teacherName;
	@Override
	public void info() {
		System.out.println("Hello, My name is " +teacherName);
		
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
