package com.bankapplication.userbankmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@Table(name="customer_master")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@Column(name="customer_number")
	private String customer_number;
	private String firstname;
	private String middlename;
	private String lastname;
	private String customer_city;
	private String customer_contact_no;
	private String occupation;
	private Date customer_date_of_birth;
	private String password;
	
	
	public String getCustomer_number() {
		return customer_number;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String customer_number, String firstname, String middlename, String lastname, String customer_city,
			String customer_contact_no, String occupation, Date customer_date_of_birth, String password) {
		super();
		this.customer_number = customer_number;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customer_city = customer_city;
		this.customer_contact_no = customer_contact_no;
		this.occupation = occupation;
		this.customer_date_of_birth = customer_date_of_birth;
		this.password = password;
	}


	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getCustomer_city() {
		return customer_city;
	}


	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}


	public String getCustomer_contact_no() {
		return customer_contact_no;
	}


	public void setCustomer_contact_no(String customer_contact_no) {
		this.customer_contact_no = customer_contact_no;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public Date getCustomer_date_of_birth() {
		return customer_date_of_birth;
	}


	public void setCustomer_date_of_birth(Date customer_date_of_birth) {
		this.customer_date_of_birth = customer_date_of_birth;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [customer_number=" + customer_number + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", customer_city=" + customer_city + ", customer_contact_no="
				+ customer_contact_no + ", occupation=" + occupation + ", customer_date_of_birth="
				+ customer_date_of_birth + ", password=" + password + "]";
	}
	
	
}
