package org.abhi.test;

import org.abhi.comp.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Setter_ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("org/abhi/cfgs/applicationContext.xml"));
		//get spring bean class object
		stud=factory.getBean("stud",Student.class);
		System.out.println(stud);
	}

}
