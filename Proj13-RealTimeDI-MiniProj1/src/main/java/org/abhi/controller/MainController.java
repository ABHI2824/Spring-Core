package org.abhi.controller;

import org.abhi.dto.CustomerDTO;
import org.abhi.service.CutomerServiceMgmt;
import org.abhi.vo.CustomerVO;

public class MainController {
	private CutomerServiceMgmt service;

	public MainController(CutomerServiceMgmt service) {
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception{
		CustomerDTO dto=null;
		String result=null;
		//convert VO class object to DTO class object 
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		//use service
		result=service.calculateInterestAmt(dto);
		return result;
	}
	
}
