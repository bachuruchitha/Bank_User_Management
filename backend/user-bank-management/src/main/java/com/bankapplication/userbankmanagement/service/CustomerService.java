package com.bankapplication.userbankmanagement.service;

import com.bankapplication.userbankmanagement.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Boolean isValid(Customer customer);
	boolean isExist(String customer_number);
}
