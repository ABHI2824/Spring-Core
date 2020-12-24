package org.abhi.comp;

public class CEATTyre implements Tyre {

	public CEATTyre() {
		System.out.println("CEAT Tyre :: 0-param constructor ");
	}
	
	@Override
	public String roadGrip() {
		return "CEAT Tyre  :: Smooth road grip -> Suitable for Luxory Comfort Car ";
	}

}
