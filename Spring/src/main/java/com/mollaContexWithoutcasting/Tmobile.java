package com.mollaContexWithoutcasting;

public class Tmobile implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using  Tmobile");
		
	}

	@Override
	public void data() {
		System.out.println("surfing using  Tmobile");
		
	}

	@Override
	public void texting() {
		System.out.println("Texting using  Tmobile");
		
	}

}
