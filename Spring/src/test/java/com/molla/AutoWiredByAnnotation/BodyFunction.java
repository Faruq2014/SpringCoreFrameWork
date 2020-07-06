	package com.molla.AutoWiredByAnnotation;
	
	public class BodyFunction {
		// you can not Autowire properties values such as variables.
		int heart;
		int eyes;
		String name;
	
		public int getHeart() {
			return heart;
		}
	
		public void setHeart(int heart) {
			this.heart = heart;
		}
	
		public int getEyes() {
			return eyes;
		}
	
		public void setEyes(int eyes) {
			this.eyes = eyes;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public void heart() {
			
			System.out.println("Name is " +name);
			System.out.println("you have: " +heart+ " heart");
			System.out.println("heart is pumping");	
		}
	
		public void eyes() {
			System.out.println("Name is " +name);
			System.out.println("You have:" +eyes +" eyes");
			System.out.println("you can see");
		}
	}
