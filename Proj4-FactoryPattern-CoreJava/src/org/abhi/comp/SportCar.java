package org.abhi.comp;

public class SportCar implements Car {
	private Tyre tyre;
	
	public SportCar(Tyre tyre) {
		System.out.println("SportCar :: 1-param constructor ");
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("Driving Sports Car having  "+tyre.roadGrip());
	}

}
