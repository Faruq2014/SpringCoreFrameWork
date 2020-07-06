package com.mollaSetterDependencyInjection;

public class Student {
 private String studentName;
 private int rollNumber;

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public void display() {
	System.out.println("Student name is: "+ studentName);
	System.out.println("Roll number is: "+rollNumber);
}

}
