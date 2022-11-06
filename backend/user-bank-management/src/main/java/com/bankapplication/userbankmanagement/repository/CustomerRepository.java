package com.bankapplication.userbankmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bankapplication.userbankmanagement.entity.Account;
import com.bankapplication.userbankmanagement.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{
	
	@Query(value = "SELECT * FROM customer_master WHERE customer_number = ?1 and password=?2", nativeQuery = true)
	  List<Customer> findByCustomerNumber(String customer_number,String password);
}
