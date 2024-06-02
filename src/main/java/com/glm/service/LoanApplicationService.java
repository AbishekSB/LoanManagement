package com.glm.service;



import java.util.List;
import java.util.Optional;

import com.glm.entity.LoanApplication;

public interface LoanApplicationService {
    String addApplicant(LoanApplication loanApplication);
    List<LoanApplication> getAllApplicantDetails();
    String updateApplicant(LoanApplication loanApplication);
    List<Integer> getApplicantId();
    LoanApplication getApplicantById(int loanId);
    List<String> getApplicantName();
    List<String> getEmailListt();
    public Optional<LoanApplication> findByUserId(int userId);
}

