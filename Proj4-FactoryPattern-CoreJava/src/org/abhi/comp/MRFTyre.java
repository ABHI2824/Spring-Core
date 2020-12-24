package org.abhi.comp;

public class MRFTyre implements Tyre {

	public MRFTyre() {
		System.out.println("MRF Tyre :: 0-param constructor ");
	}
	
	@Override
	public String roadGrip() {
		return "MRF Tyre  :: Super road grip -> Suitable for Sports Car ";
	}

}
