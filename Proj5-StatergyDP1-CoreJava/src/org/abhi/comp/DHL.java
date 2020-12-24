package org.abhi.comp;

public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL :: 0-param Constructor ");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return "DHL Courier will deliver with order id :: "+oid+ " order Products";
	}

}
