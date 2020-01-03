package com.lti.services;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Customer;

public interface CustomerService {
	Customer getCustomerDetails(int customerId) ;

	public List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException;

}
