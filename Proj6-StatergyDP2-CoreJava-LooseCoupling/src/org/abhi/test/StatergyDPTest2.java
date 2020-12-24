package org.abhi.test;

import org.abhi.comp.Flipkart;
import org.abhi.factory.FlipkartFactory;

public class StatergyDPTest2 {

	public static void main(String[] args) {
		Flipkart fpkt=null;
		try {
		   fpkt=FlipkartFactory.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem in Dependency Mgmt....");
		}
		
		// invoke b.method
		System.out.println(fpkt.shpping(new String[] {"Jacket","BlankKit","Sweater"},
													new float[] {5500,7000,1200}));
	}

}
