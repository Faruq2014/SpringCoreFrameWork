package com.mollaConstructorDI;

public class Employee {
	public Employee(String eName, Double salary) {

		this.eName = eName;
		this.salary = salary;
	}

	String eName;
	Double salary;

	public void display() {
		System.out.println("employee name is : " + eName);
		System.out.println("employee name is : " + salary);
	}

}
