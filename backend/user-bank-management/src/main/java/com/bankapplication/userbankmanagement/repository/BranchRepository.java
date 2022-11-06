package com.bankapplication.userbankmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bankapplication.userbankmanagement.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {
	@Query(value="select * from branch_master b where b.branch_id in (select a.branch_id from account_master a where a.customer_number=?1)",nativeQuery = true)
    List<Branch> findBranches(String customer_number); 
//	@Query(value="select * from branch_master",nativeQuery = true)
//  List<Branch> findBranches();

}
