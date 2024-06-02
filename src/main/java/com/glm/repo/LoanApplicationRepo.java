package com.glm.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.glm.entity.LoanApplication;

public interface LoanApplicationRepo extends JpaRepository<LoanApplication, Integer> {
	
	
	@Query("select loanId from LoanApplication order by loanId")
	public List<Integer> getIdListt();
	
	@Query("select fullName from LoanApplication order by fullName")
	public List<String> getNameListt();
	
	@Query("select email from LoanApplication order by email")
	public List<String> getEmailList();
	
	@Query("select la from LoanApplication la where la.user.userId = :userId")
	public Optional<LoanApplication> findByUserUserId(int userId);

	}
