package com.bankapplication.userbankmanagement.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CustomerDto {
	
	private String customer_number;
	private String firstname;
	private String middlename;
	private String lastname;
	private String customer_city;
	private String customer_contact_no;
	private String occupation;
	private Date customer_date_of_birth;
	private String password;
}
