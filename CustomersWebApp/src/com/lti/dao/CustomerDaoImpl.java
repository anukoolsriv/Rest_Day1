package com.lti.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.lti.bean.Customer;
import com.lti.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao {

	DbUtil util = null;
	Connection conn = null;
	DataSource ds = null;

	public CustomerDaoImpl() throws SQLException {
		util = new DbUtil();
	}

	@Override
	public List<Customer> getAllCustomers() throws ClassNotFoundException {
		List<Customer> myList = null;
		try {
			myList = new ArrayList<>();
			conn = util.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from customers");
//			System.out.println(rs.next());
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double amt = rs.getFloat(3);
//				System.out.println(id + " " + name + " " + amt);
				Customer cust = new Customer(id, name, amt);
				myList.add(cust);
			}
			return myList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return myList;
	}

	@Override
	public Customer getCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
}
