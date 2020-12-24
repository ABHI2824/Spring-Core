package org.abhi.test;

public class NewInstanceTest1 {

	public static void main(String[] args) {
		Class c1=null, c2=null;
		Object obj1=null, obj2=null;
		try {
			//Load the Class
			c1=Class.forName(args[0]);
			// Instantiate the Loaded class
			obj1=c1.newInstance();
			System.out.println(obj1);
			System.out.println("--------------------------------------------------------------------------");
			//Load the Class
			c2=Class.forName(args[1]);
			//Instantiate the Loaded class
			obj2=c2.newInstance();
			System.out.println(obj2);
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
