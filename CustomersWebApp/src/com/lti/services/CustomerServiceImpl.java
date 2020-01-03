package com.lti.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Customer;
import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao dao;
		
	
	
	public CustomerServiceImpl() throws SQLException {
		this.dao = new CustomerDaoImpl();
	}

	@Override
	public Customer getCustomerDetails(int customerId) {
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException {
		List<Customer> myList = null;
		
		myList = new ArrayList<>();
		CustomerDaoImpl customerImpl = new CustomerDaoImpl();
		myList = customerImpl.getAllCustomers();
		
		return myList;
	}

}
