
package com.glm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glm.entity.LoanApplication;
import com.glm.service.LoanApplicationService;

@RestController
@CrossOrigin("http://localhost:3000")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService loanApplicationService;

    @PostMapping("/addApplicant")
    public String addApplicant(@RequestBody LoanApplication loanApplication) {
        return loanApplicationService.addApplicant(loanApplication);
    }

    @GetMapping("getAllApplicantDetails")
    public List<LoanApplication> getAllApplicantDetails() {
        return loanApplicationService.getAllApplicantDetails();
    }

    @PutMapping("/updateApplicant")
    public String updateApplicant(@RequestBody LoanApplication loanApplication) {
        return loanApplicationService.updateApplicant(loanApplication);
    }

    @GetMapping("getApplicantId")
    public List<Integer> getApplicantId() {
        return loanApplicationService.getApplicantId();
    }

    @GetMapping("/getApplicantById/{loanId}")
    public LoanApplication getApplicantByID(@PathVariable("loanId") int loanId) {
        return loanApplicationService.getApplicantById(loanId);
    }
    @GetMapping("getApplicantName")
    public List<String> getApplicantName(){
    	return loanApplicationService.getApplicantName();
    }
    
    @GetMapping("/getEmailList")
    public List<String> getEmail(){
    	return loanApplicationService.getEmailListt();
    }
    
    @GetMapping("/findApplicationOfUser")
    public Optional<LoanApplication> findByUserId(@RequestParam int userId)
    {
    	return loanApplicationService.findByUserId(userId);
    }
}

