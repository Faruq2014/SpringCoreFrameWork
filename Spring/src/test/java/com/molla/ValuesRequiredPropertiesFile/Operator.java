	package com.molla.ValuesRequiredPropertiesFile;
	
	import org.springframework.beans.factory.annotation.Autowired;
	
	public class Operator {
	// Autowired by dependency
		@Autowired
		Student student;
	
	
		public void Operation() {
			student.displayStudentInfo();
		}
	}
