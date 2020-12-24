package org.abhi.test;



import org.abhi.comp.Flipkart;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StatergyDPTest {

	public static void main(String[] args) {
		Flipkart fpkt=null;
		Resource res=null;
		BeanFactory factory=null;
		//Locate Cfgs file
		res= new ClassPathResource("org/abhi/cfgs/applicationContext.xml");
		//create IOC Container
		factory=new XmlBeanFactory(res);
		//get Target class Bean object 
		fpkt=factory.getBean("fpkt1",Flipkart.class);
		
		// invoke b.method
		System.out.println(fpkt.shpping(new String[] {"Jacket","BlankKit","Sweater"},
													new float[] {5500,7000,1200}));
	}

}
