	package com.molla.AutoWiredByAnnotation;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
	
	public class Human {  
		/* three way we can Autowire and qualifire
		 * 1. at dependency
		 * 2. at setter 
		 * 3. at constructor
		 * */
		/*
		 * @Autowired // to use @Autowire on dependency
		 * <context:annotation-config></context:annotation-config> is on at xml file It
		 * is better to have a default constructor,
		 * First: it try to inject the dependency with "byType"
		 * if byType fails then: it try to inject the dependency with "byName"
		 * you do not need setter method.
		 */
		
		@Autowired
		@Qualifier("Cow")
		BodyFunction function;
	
		public Human() { // System.out.println("human default constructor");
		}
	
		// @Autowired // to use @Autowire on constructor
		// <context:annotation-config></context:annotation-config> is on at xml file
	
		public Human(BodyFunction function) {
			this.function = function;
			// System.out.println("human function constructor");
		}
	
	//	@Autowired // to use @Autowire on setter method
		// <context:annotation-config></context:annotation-config> is on at xml file
		// It is better to have a default constructor
		//@Qualifier("Cow")
		public void setFunction(BodyFunction function) {
			this.function = function;
			// System.out.println("human function setter");
		}
	
		public void alive() {
			if (function != null) {
				function.heart();
			} else {
				System.out.println("Your heart is not working");
			}
			if (function != null) {
				function.eyes();
			} else {
				System.out.println("Your eyes are not working");
			}
	
		}
	}
