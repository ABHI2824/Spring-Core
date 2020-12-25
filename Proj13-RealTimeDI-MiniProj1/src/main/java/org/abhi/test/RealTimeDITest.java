package org.abhi.test;

import java.util.Scanner;

import org.abhi.controller.MainController;
import org.abhi.vo.CustomerVO;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.stereotype.Controller;

public class RealTimeDITest {

	public static void main(String[] args) {
		Scanner sc=null;
		String cname=null,cadd=null,pamt=null,rate=null,time=null;
		CustomerVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController cont=null;
		String result=null;
		//read input from end user
		sc=new Scanner(System.in);
		System.out.println("Enter Customer Name :: ");
		cname=sc.next();
		System.out.println("Enter Customer Adress :: ");
		cadd=sc.next();
		System.out.println("Enter Principle amount :: ");
		pamt=sc.next();
		System.out.println("Enter rate of Interest :: ");
		rate=sc.next();
		System.out.println("Enter Time :: ");
		time=sc.next();
		
		
		//store input in vo class object
		vo=new CustomerVO();
		vo.setCname(cname);
		vo.setCadd(cadd);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		
		//create Bean factory IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("org/abhi/cfgs/applicationContext.xml");
		//get Controller bean class object
		cont=factory.getBean("controller",MainController.class);
		//invoke the method
		try {
			result=cont.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("internal problem ");
			e.printStackTrace();
		}
	}

}
