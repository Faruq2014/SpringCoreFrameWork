package com.mollaCommonDI;

public class StudentTwo {
private CommonInfo mathscore;
private int roll;
private String name;
private int score;

public void setScore(int score) {
	this.score = score;
}

public void setName(String name) {
	this.name = name;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public void setMathscore(CommonInfo mathscore) {
	this.mathscore = mathscore;
}

public void studentScore() {
	mathscore.score();
	System.out.println("Your roll number is: "+roll);
	System.out.println("Your name is: "+name);
	System.out.println("your score is "+ score);	
	
}
}
