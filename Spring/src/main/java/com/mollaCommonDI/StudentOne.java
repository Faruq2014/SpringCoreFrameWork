package com.mollaCommonDI;

public class StudentOne {
	private CommonInfo info;
;
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

	public void setMathscore(CommonInfo info) {
		this.info = info;
	}

	public void studentScore() {
		info.score();
		System.out.println("Your roll number is: " + roll);
		System.out.println("Your name is: " + name);
		System.out.println("your score is " + score);

	}
}
