package com.mollaCommonDI;

public class CommonInfo {

	public CommonInfo() {
		super();
		System.out.println("math score constructor called");
	}

	public void score() {
		String University = "George masson";
		String Year = "2020";
		String Subject = "Java";
		String Session = "Winter";

		System.out.println("University name is: " + University);
		System.out.println("Year name is: " + Year);
		System.out.println("Subject name is: " + Subject);
		System.out.println("Session name is: " + Session);

	
	}
}
