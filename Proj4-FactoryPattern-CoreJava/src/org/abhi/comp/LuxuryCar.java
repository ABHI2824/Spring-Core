package org.abhi.comp;

public class LuxuryCar implements Car {
	private Tyre tyre;
	
	public LuxuryCar(Tyre tyre) {
		System.out.println("LuxaryCar :: 1-param constructor ");
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("Driving Luxary Car having  "+tyre.roadGrip());
	}

}
