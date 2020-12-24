package org.abhi.test;

import org.abhi.comp.Car;
import org.abhi.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstance("luxury");
		car.drive();
		System.out.println("...................................");
		car=CarFactory.getInstance("standard");
		car.drive();

	}

}
