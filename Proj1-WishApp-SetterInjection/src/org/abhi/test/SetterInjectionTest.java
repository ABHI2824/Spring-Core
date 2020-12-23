package org.abhi.test;

import org.abhi.beans.WishMessageGenerator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		WishMessageGenerator generator=null;
		BeanFactory factory=null;
		
		//hold name and location of cfgs file to resource obj
		res= new FileSystemResource("src/org/abhi/cfgs/applicationContext.xml");
		//create IOC container/Spring Container(Bean Factory)
		factory=new XmlBeanFactory(res);
		//get target class obj from bean factory container
		Object obj=factory.getBean("wmg");
		generator=(WishMessageGenerator)obj;
		String result=generator.generateMessage("Raju");
		System.out.println(result);
	}

}
