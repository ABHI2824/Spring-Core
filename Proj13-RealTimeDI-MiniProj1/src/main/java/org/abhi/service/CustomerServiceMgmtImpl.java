package org.abhi.service;

import org.abhi.bo.CustomerBO;
import org.abhi.dao.CustomerDAO;
import org.abhi.dto.CustomerDTO;

public class CustomerServiceMgmtImpl implements CutomerServiceMgmt{
	private CustomerDAO dao;
	
	public CustomerServiceMgmtImpl(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateInterestAmt(CustomerDTO dto) throws Exception {
		float intrAmt=0.0f;
		CustomerBO bo=null;
		int count=0;
		//calculate interest Amount
		intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
	
		//prepare Customer BO object  having persistable data
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntramt(intrAmt);
		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			return "Customer Registration failed :: Amt :: "+dto.getPamt()+ "  ::  Interest Amount  ::  "+intrAmt;
		else
			return "Customer Registration Succeded :: Amt :: "+dto.getPamt()+ "  ::  Interest Amount  ::  "+intrAmt;

	}

}
