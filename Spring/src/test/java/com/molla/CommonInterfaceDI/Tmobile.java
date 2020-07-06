package com.molla.CommonInterfaceDI;

public class Tmobile implements Services {
	String name = "T Mobile";
	@Override
	public void name() {
		
		int simNumber = 63210987;
		System.out.println("Sim number: "+simNumber);
		System.out.println( "if sim number start with 5, it is a Verizone number");
		System.out.println("so it is " + name + " Sim");
		System.out.println("intializing the Sim..... in a few sec:");
		System.out.println();
	}

	@Override
	public void calling() {
		int Call = 5;
		System.out.println("if sim ring more than " + (Call) + " sec, it is a  call");
		System.out.println("if sim ring more than " + (Call + 1) + " sec, it is a miss call");
		System.out.println("if sim ring more than " + (Call + 2) + " sec, it is a voice call");
		System.out.println();
	}

	@Override
	public void texting() {
		
		String text = "Assalamualikum, how are you? Alhamdulillah we are good";
		System.out.println("I am texting to my friend from : "+name);
		System.out.println(text);
		System.out.println();

	}

	@Override
	public void data() {
		String web = "https://www.facebook.com";
		System.out.println("i am surfing on " + web +" from "+name);
		System.out.println();
	}

	@Override
	public void picture() {
		String jpg = "I am taking picture of 60mpg";
		System.out.println(jpg +" from "+name);
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
	}

}
