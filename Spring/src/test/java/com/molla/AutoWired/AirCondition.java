package com.molla.AutoWired;

public class AirCondition {

	int temp=90; // this input will come from user. 

	public void turnOnAutoAirConditionar() {
		if (temp <= 60) {
			System.out.println("turn Heater on");
		} else if (temp >= 61 && temp <= 80) {
			System.out.println("turn Fan on");
		} else {
			System.out.println("turn Ac on");
		}
	}
	
	String music1="bangla";
	String music2="English";
	String music3="Hindi";
	
	public void music() {
		if (temp <= 60) {
			System.out.println("turn Heater on and "+music1+ " music" );
		} else if (temp >= 61 && temp <= 80) {
			System.out.println("turn Heater on and "+music2+ " music" );
		} else {
			System.out.println("turn Heater on and "+music3+ " music" );
		}
	}
}
