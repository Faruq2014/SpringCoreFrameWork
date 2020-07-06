package com.mollaInterfaceDI;

public class CallingService implements Services{

	@Override
	public void callService() {
		int ringingSec=4;
		
		System.out.println("if Ringing more than "+ringingSec+" Sec it is a miss call");
		
	}

}
