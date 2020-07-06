package com.mollaContexWithoutcasting;

public class Verizon implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using  Verizon");
		
	}

	@Override
	public void data() {
		System.out.println("surfing using  Verizon");
		
	}

	@Override
	public void texting() {
		System.out.println("Texting using  Verizon");
		
	}

}
