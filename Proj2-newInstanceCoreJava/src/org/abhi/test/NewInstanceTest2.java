package org.abhi.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {

	public static void main(String[] args) {
		Class c1=null, c2=null;
		Object obj1=null;
		Constructor cons[]=null;
		try {
			//Load the Class
			c1=Class.forName(args[0]);
			//get All Constructor of the loaded class
			cons=c1.getDeclaredConstructors();
			//create the object
			obj1=cons[0].newInstance(10,20);
			System.out.println(obj1);
			System.out.println("--------------------------------------------------------------------------");
			}
		catch(InstantiationException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
