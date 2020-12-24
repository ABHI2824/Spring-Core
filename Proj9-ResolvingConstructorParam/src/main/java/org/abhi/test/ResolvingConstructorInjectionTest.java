package org.abhi.test;

import org.abhi.beans.Employee;
import org.abhi.beans.Marks;
import org.abhi.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ResolvingConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks marks=null;
		Employee emp1=null;
		Student stud=null;
		
		//create IOC Container
		factory= new XmlBeanFactory(new ClassPathResource("org/abhi/cfgs/applicationContext.xml"));
		//get bean objects
		System.out.println(".............................................................");
		marks=factory.getBean("mk", Marks.class);
		System.out.println(marks);
		System.out.println("-------------------------------------------------------");
		stud=factory.getBean("st", Student.class);
		System.out.println(stud);
		System.out.println("-------------------------------------------------------");
		emp1=factory.getBean("emp", Employee.class);
		System.out.println(emp1);
		System.out.println("-------------------------------------------------------");		

  }//main
}//class
