package com.lti.dao;

import java.util.List;

import com.lti.bean.Customer;

public interface CustomerDao {

	Customer getCustomerDetails(int customerId);

	public List<Customer> getAllCustomers() throws ClassNotFoundException;
}
