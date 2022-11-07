package com.bankapplication.userbankmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapplication.userbankmanagement.dto.CustomerDto;
import com.bankapplication.userbankmanagement.entity.Customer;
import com.bankapplication.userbankmanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	@Override
	public Boolean isValid(Customer customer) {
		return customerRepository.findByCustomerNumber(customer.getCustomer_number(), customer.getPassword()).size()==1;
	}
	@Override
	public boolean isExist(String customer_number) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customer_number) != null;
	}
	

}
