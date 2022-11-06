package com.bankapplication.userbankmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapplication.userbankmanagement.entity.Branch;
import com.bankapplication.userbankmanagement.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {
	

	@Autowired
	private BranchRepository branchRepo;
	@Override
	public List<Branch> getBranches(String customer_number) {
//		List<String> branch_names=new ArrayList();
//		List<Branch> branches=branchRepo.findBranches(customer_number);
//		for(int i=0;i<branches.size();i++) {
//			branch_names.add(branches.get(i).getBranch_name());
//		}
		return branchRepo.findBranches(customer_number);
	}

}
