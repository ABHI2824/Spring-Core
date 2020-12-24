package org.abhi.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC :: 0-param Constructor ");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will deliver with order id :: "+oid+ " order Products";
	}

}
