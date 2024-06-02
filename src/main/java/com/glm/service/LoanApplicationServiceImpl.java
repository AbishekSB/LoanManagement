package com.glm.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glm.entity.LoanApplication;
import com.glm.repo.LoanApplicationRepo;
import com.glm.service.LoanApplicationService;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private LoanApplicationRepo repo;

    @Override
    public String addApplicant(LoanApplication loanApplication) {
        String msg = " ";
        try {
            loanApplication.setStatus("Pending");
            repo.save(loanApplication);
            msg = "object saved";
        } catch (Exception e) {
            msg = "Object not saved";
        }
        return msg;
    }

    @Override
    public List<LoanApplication> getAllApplicantDetails() {
        return repo.findAll();
    }

    @Override
    public String updateApplicant(LoanApplication loanApplication) {
        String msg = " ";
        try {
            repo.save(loanApplication);
            msg = "object saved";
        } catch (Exception e) {
            msg = "Object not saved";
        }
        return msg;
    }

    @Override
    public List<Integer> getApplicantId() {
        return repo.getIdListt();
    }

    @Override
    public LoanApplication getApplicantById(int loanId) {
        return repo.findById(loanId).orElse(null);
    }
    
  
	@Override
	public List<String> getApplicantName() {
		return repo.getNameListt();
		
	}

	@Override
	public List<String> getEmailListt() {
		
		return repo.getEmailList();
	}

	@Override
	public Optional<LoanApplication> findByUserId(int userId) {
		
		return repo.findByUserUserId(userId);
	}
    
}

