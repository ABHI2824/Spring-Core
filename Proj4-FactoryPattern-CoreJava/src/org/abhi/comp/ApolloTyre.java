package org.abhi.comp;

public class ApolloTyre implements Tyre {

	public ApolloTyre() {
		System.out.println("Apollo Tyre :: 0-param constructor ");
	}
	
	@Override
	public String roadGrip() {
		return "Apollo Tyre  :: Standard road grip -> Suitable for any Transportation ";
	}

}
