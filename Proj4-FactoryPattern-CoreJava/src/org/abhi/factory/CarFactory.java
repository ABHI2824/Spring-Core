package org.abhi.factory;

import org.abhi.comp.ApolloTyre;
import org.abhi.comp.CEATTyre;
import org.abhi.comp.Car;
import org.abhi.comp.LuxuryCar;
import org.abhi.comp.MRFTyre;
import org.abhi.comp.SportCar;
import org.abhi.comp.StandardCar;
import org.abhi.comp.Tyre;

public class CarFactory {
	//factory method
	public static Car getInstance(String type) {
		Tyre tyre=null;
		Car car=null;
		
		if(type.equalsIgnoreCase("sport")) {
			tyre=new CEATTyre();
			car= new SportCar(tyre);
		}
		
		else if(type.equalsIgnoreCase("luxury")) {
			tyre=new MRFTyre();
			car=new LuxuryCar(tyre);
		}
		
		else if(type.equalsIgnoreCase("standard")) {
			tyre=new ApolloTyre();
			car= new StandardCar(tyre);
		}
		return car;
	}
}
