package com.molla.AutoWired;

public class DashBoard {
	private AirCondition ac;
	
	public DashBoard(AirCondition ac) {
		this.ac = ac;
	}

	public void setAc(AirCondition ac) {
		this.ac = ac;
	}

	public void temperature() {
		if (ac !=null) {
			ac.turnOnAutoAirConditionar();
			ac.music();
		}else {   System.out.println("AutoAirConditionar is not working, show sign on dashboard");}
		
		
	}
	
}
