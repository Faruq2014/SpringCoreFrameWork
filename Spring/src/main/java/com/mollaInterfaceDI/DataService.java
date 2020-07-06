package com.mollaInterfaceDI;

public class DataService implements Services{

	@Override
	public void callService() {
		String text="I am texting";
		System.out.println(text);
		
	}

}
