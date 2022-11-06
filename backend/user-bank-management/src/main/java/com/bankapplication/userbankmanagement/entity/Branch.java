package com.bankapplication.userbankmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Table(name="branch_master")
public class Branch {
	@Id
	@Column(name="branch_id")
	private String branch_id;
	private String branch_name;
	private String branch_city;

	public String getBranch_id() {
		return branch_id;
	}
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(String branch_id, String branch_name, String branch_city) {
	super();
	this.branch_id = branch_id;
	this.branch_name = branch_name;
	this.branch_city = branch_city;
}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_city=" + branch_city + "]";
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	
}
