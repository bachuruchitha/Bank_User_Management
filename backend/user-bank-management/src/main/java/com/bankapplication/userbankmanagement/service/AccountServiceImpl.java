package com.bankapplication.userbankmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapplication.userbankmanagement.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;
	@Override
	public Boolean getAccounts(String customer_number) {
		if(accountRepo.findByCustomerNumber(customer_number).size()==0) {
			return false;
		}
		return true;
	}

}
