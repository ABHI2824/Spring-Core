package org.abhi.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	Courier courier=null;
	
	public Flipkart() {
		System.out.println("Flipkart :: 0- param Constructor ");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	//b.method
	public String shpping(String []items,float []prices) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		Random rad=null;
		
		//calculate bill amt
		for(float p:prices) { 
	// 	billAmt=billAmt+p;
		    billAmt+=p;	
		}

		//generated order id dynamically as random number
		rad=new Random();
		oid=rad.nextInt(25000);
		
		//use courier service to deliver product
		msg=courier.deliver(oid);
		
		// return billAMt and courier details to the customer
		
		return Arrays.toString(items)+"  are purchased having prices  "+Arrays.toString(prices)+
				         "  with bill amount "+billAmt+" ----------"+msg;
	}
	
}
