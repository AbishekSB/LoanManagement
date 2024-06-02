package com.glm.service;



import java.util.List;
import com.glm.entity.Scheme;

public interface SchemeService {
    String createScheme(Scheme scheme);
    String updateScheme(Scheme scheme);
    List<Scheme> getAllSchemes();
    List<String> getSchemeNameList();
    List<Integer> getSchemeIdList();
}

