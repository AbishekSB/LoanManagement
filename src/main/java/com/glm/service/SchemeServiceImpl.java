package com.glm.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glm.entity.Scheme;
import com.glm.repo.SchemeRepo;
import com.glm.service.SchemeService;

@Service
public class SchemeServiceImpl implements SchemeService {

    @Autowired
    private SchemeRepo schemeRepo;

    @Override
    public String createScheme(Scheme scheme) {
        String msg = " ";
        try {
            schemeRepo.save(scheme);
            msg = "New Scheme inserted";
        } catch (Exception e) {
            msg = "Scheme not inserted";
        }
        return msg;
    }

    @Override
    public String updateScheme(Scheme scheme) {
        String msg = " ";
        try {
            schemeRepo.save(scheme);
            msg = "Scheme updated";
        } catch (Exception e) {
            msg = "Scheme not updated";
        }
        return msg;
    }

    @Override
    public List<Scheme> getAllSchemes() {
        return schemeRepo.findAll();
    }

    @Override
    public List<String> getSchemeNameList() {
        return schemeRepo.getNameList();
    }

    @Override
    public List<Integer> getSchemeIdList() {
        return schemeRepo.getIdList();
    }
}
