package org.abhi.factory;

import org.abhi.comp.BlueDart;
import org.abhi.comp.Courier;
import org.abhi.comp.DHL;
import org.abhi.comp.DTDC;
import org.abhi.comp.FirstFlight;
import org.abhi.comp.Flipkart;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierName) {
		Flipkart fpkt=null;
		Courier courier=null;
		
		//create Dependent class obj
		if(courierName.equalsIgnoreCase("dtdc")) 
			courier=new DTDC();
		
		else if(courierName.equalsIgnoreCase("bluedart"))
			courier=new BlueDart();
		
		else if(courierName.equalsIgnoreCase("firstflight"))
			courier=new FirstFlight();
		
		else if(courierName.equalsIgnoreCase("dhl"))
			courier=new DHL();
		
		else 
			throw new IllegalArgumentException("invalid Courier Name ");
		
		//create Target class objs
		fpkt=new Flipkart();
		
		//assign dependent class objs to target class objs
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
}
