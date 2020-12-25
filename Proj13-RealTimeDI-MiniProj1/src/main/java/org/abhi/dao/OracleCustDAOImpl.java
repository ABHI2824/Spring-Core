package org.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.abhi.bo.CustomerBO;

public final class OracleCustDAOImpl implements CustomerDAO{
		private static final String CUSTOMER_INSERT_QUERY="INSERT INTO SPRING_CUSTOMER "
																+ "VALUES(CNO.NEXTVAL,?,?,?,?)";
		private DataSource ds;
		
		public OracleCustDAOImpl(DataSource ds) {
			this.ds = ds;
		}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled jdbc connection
		con=ds.getConnection();
		//create PreparedStatement Object
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		//set values to query param
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getIntramt());
		//execute the SQL Query
		count=ps.executeUpdate();
		//close jdbc connection
		ps.close();
		con.close();
		return count;
	}
}
