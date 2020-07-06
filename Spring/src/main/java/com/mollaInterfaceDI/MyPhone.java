package com.mollaInterfaceDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPhone {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext("InterfaceDI.xml");
		System.out.println("Alhamdulillah");
		ATandT feature1 = contex.getBean("ATandTcalling", ATandT.class);
		feature1.activeService();
		
		ATandT feature2 = contex.getBean("ATandTData", ATandT.class);
		feature2.activeService();
		
		ATandT feature3 = contex.getBean("ATandTtune", ATandT.class);
		feature3.activeService();

	}

}
