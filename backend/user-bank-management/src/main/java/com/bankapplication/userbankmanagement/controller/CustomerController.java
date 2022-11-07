package com.bankapplication.userbankmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankapplication.userbankmanagement.dto.CustomerDto;
import com.bankapplication.userbankmanagement.entity.Branch;
import com.bankapplication.userbankmanagement.entity.Customer;
import com.bankapplication.userbankmanagement.repository.CustomerRepository;
import com.bankapplication.userbankmanagement.service.AccountService;
import com.bankapplication.userbankmanagement.service.BranchService;
import com.bankapplication.userbankmanagement.service.CustomerService;
import java.util.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private AccountService accountService;

	@Autowired
	private BranchService branchService;

	@PostMapping("/register")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		if (customerService.isExist(customer.getCustomer_number())) {
			System.out.println("Exist"+customer);
			return null;
		} else {
			System.out.println("Not Exist"+customer);
			return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.OK);
		}

	}

	@GetMapping("/accountExist")
	public ResponseEntity<Boolean> getAccountHolders(@RequestParam String customer_number) {
		return new ResponseEntity<Boolean>(accountService.getAccounts(customer_number), HttpStatus.OK);

	}

	@PostMapping("/login")
	public ResponseEntity<Boolean> isValid(@RequestBody Customer customer) {

		return new ResponseEntity<Boolean>(customerService.isValid(customer), HttpStatus.OK);

	}

	@GetMapping("/getBranches")
	public ResponseEntity<List<Branch>> getBranches(@RequestParam String customer_number) {
		System.out.println("Customer" + customer_number);
		return new ResponseEntity<List<Branch>>(branchService.getBranches(customer_number), HttpStatus.OK);
	}

}
