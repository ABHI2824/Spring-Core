package org.abhi.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.abhi.comp.BlueDart;
import org.abhi.comp.Courier;
import org.abhi.comp.DHL;
import org.abhi.comp.DTDC;
import org.abhi.comp.FirstFlight;
import org.abhi.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	
	static {
		InputStream is=null;
		try {
			//locate properties using stream
			is= new FileInputStream("src/org/abhi/commons/info.properties");
			//load properties file into java.util.Properties
			props=new Properties();
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static block
	
	
	
	public static Flipkart getInstance() throws Exception{
		Flipkart fpkt=null;
		Courier courier=null;
		
		//create Dependent class obj
		courier=(Courier) Class.forName(props.getProperty("sdp.dependent")).newInstance();
		
		//create Target class objs
		fpkt=new Flipkart();
		
		//assign dependent class objs to target class objs
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
}
