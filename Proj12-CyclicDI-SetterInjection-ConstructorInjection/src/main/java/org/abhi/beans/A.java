package org.abhi.beans;

public class A {
	private B b;
	
	public A() {
		System.out.println("A() :: 0- param constructor ");
	}
	
	
	public void setB(B b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}
