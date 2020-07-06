package com.mollaContexWithoutcasting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Iphone {

	public static void main(String[] args) {
		
		ApplicationContext contex= new ClassPathXmlApplicationContext("ContexWithoutCasting.xml");
		System.out.println("alhamdulillah loaded");
		Sim sim=contex.getBean("sim", Sim.class);
		
		//Sim sim=new Verizon();
		sim.calling();
		sim.data();
		sim.texting();

	}

}
