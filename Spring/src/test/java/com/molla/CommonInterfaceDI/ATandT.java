package com.molla.CommonInterfaceDI;

public class ATandT implements Services {

	@Override
	public void name() {
		String name = "AT&T";
		int simNumber = 43210987;
		System.out.println("Sim number: "+simNumber);
		System.out.println( "if sim number start with 4, it is an AT&T number");
		System.out.println("so it is " + name + " Sim");
		System.out.println("intializing the Sim..... in a few sec:");
		System.out.println();
	}

	@Override
	public void calling() {
		int Call = 4;
		System.out.println("if sim ring more than " + (Call) + " sec, it is a  call");
		System.out.println("if sim ring more than " + (Call + 1) + " sec, it is a miss call");
		System.out.println("if sim ring more than " + (Call + 2) + " sec, it is a voice call");
		System.out.println();
	}

	@Override
	public void texting() {
		String text = "Assalamualikum, how are you? Alhamdulillah we are good";
		System.out.println("I am texting to my friend: ");
		System.out.println(text);
		System.out.println();

	}

	@Override
	public void data() {
		String web = "https://www.facebook.com";
		System.out.println("i am surfing to " + web);
		System.out.println();
	}

	@Override
	public void picture() {
		String jpg = "taking picture of 30mpg";
		System.out.println(jpg);
         System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
	}

}
