package com.molla.BeanAnnotation;

public class School {
	
private Principal principal; // calling Principal class

public School() {//default constructor for setter injection
}

public void setPrincipal(Principal principal) {
	this.principal = principal;
}

	/*
 * public School(Principal principal) { // creating constructor injection for
 * Principal class this.principal = principal; }
 */	
	public void test() {
		System.out.println("Bismillah from test");
		principal.principalInfo();
	}
}
