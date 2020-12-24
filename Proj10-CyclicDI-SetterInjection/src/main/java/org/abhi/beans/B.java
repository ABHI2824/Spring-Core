package org.abhi.beans;

public class B {
	private A a;
	
	public B() {
		System.out.println("B() :: 0- param Constructor ");
	}
	
	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

	
	
}
