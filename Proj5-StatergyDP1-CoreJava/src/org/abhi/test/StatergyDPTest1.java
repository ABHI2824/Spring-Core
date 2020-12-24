package org.abhi.test;

import org.abhi.comp.Flipkart;
import org.abhi.factory.FlipkartFactory;

public class StatergyDPTest1 {

	public static void main(String[] args) {
		Flipkart fpkt=null;
		fpkt=FlipkartFactory.getInstance("dHl");
		System.out.println(fpkt.shpping(new String[] {"Jacket","BlankKit","Sweater"},
													new float[] {5500,7000,1200}));
	}

}
