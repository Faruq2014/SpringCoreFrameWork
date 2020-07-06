package com.molla.ComponentAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SA Gov College") // naming your bean
public class College { // if you do not name: by default it will name the bean with class name but it will 
	// first letter as small. such as college
	
	private String collegeName;
	
	@Value("${college.Name}")
	@Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	private Teacher teacher;

	@Autowired
	@Qualifier("scienceTeacher")
	  public void setTeacher(Teacher teacher) { 
		  this.teacher = teacher; }
	 
	public void method1() {
		System.out.println("Bismillah");
		System.out.println(collegeName);
		teacher.info();
		teacher.teach();
	}
}
