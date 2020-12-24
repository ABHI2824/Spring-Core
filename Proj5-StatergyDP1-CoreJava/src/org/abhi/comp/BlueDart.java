package org.abhi.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart :: 0-param Constructor ");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will deliver with order id :: "+oid+ " order Products";
	}

}
