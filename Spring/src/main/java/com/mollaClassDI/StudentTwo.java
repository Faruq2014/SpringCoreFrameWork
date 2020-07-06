package com.mollaClassDI;

public class StudentTwo {
private MathScore mathscore;
private int roll;

public void setRoll(int roll) {
	this.roll = roll;
}

public void setMathscore(MathScore mathscore) {
	this.mathscore = mathscore;
}

public void studentScore() {
	mathscore.score();
	System.out.println("Your roll number is: "+roll);
}
}
