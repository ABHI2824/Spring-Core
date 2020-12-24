package org.abhi.beans;

import java.util.Date;

public class WishMessageGenerator {
	// properties or field
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator :: static block ");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator() :: 0-param consructor ");
	}
	
	// constructor
	public WishMessageGenerator(Date date) {
		this.date = date;
	}
	 
	public void setDate(Date date1) {
		this.date=date1;
	}
	 
	public String generateMessage(String user) {
		 int hour=0;
		 hour=date.getHours();
		 
		 if(hour<12)
			return "Good Morning :: "+user;
		 
		 else if(hour<16)
			 return "Good AfterNoon :: "+user;

		 else if(hour<20)
			 return "Good Evening :: "+user;
		 
		 return "Good Night :: "+user;
	 }
	 
}
