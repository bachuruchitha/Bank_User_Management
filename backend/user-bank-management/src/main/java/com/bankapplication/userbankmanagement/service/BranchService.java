package com.bankapplication.userbankmanagement.service;
import java.util.List;

import com.bankapplication.userbankmanagement.entity.Branch;

public interface BranchService {
	public List<Branch> getBranches(String customer_number);
}
