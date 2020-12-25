package org.abhi.dao;

import org.abhi.bo.CustomerBO;

public interface CustomerDAO {
	public int insert(CustomerBO bo)throws Exception;
}
