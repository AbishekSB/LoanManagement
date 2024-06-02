//package com.glm.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.glm.entity.Scheme;
//import com.glm.repo.SchemeRepo;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//public class SchemeController {
//	
//	@Autowired
//	SchemeRepo repo;
//	
//	@PostMapping("/AddSchemes")
//	public String createScheme(@RequestBody Scheme scheme) {
//	String msg=" ";
//	try {
//		repo.save(scheme);
//		msg = " New Scheme inserted";
//	} catch (Exception e) {
//		msg = "Scheme not inserted";
//	}
//	return msg;
//}
//	
//	@PutMapping("/UpdateScheme")
//	public String updateScheme(@RequestBody Scheme scheme) {
//	String msg=" ";
//	try {
//		repo.save(scheme);
//		msg = " New Scheme inserted";
//	} catch (Exception e) {
//		msg = "Scheme not inserted";
//	}
//	return msg;
//}
//
//	@GetMapping("getAllDetails")
//	public List<Scheme> getAllScheme()
//	{
//		List<Scheme> scheme = repo.findAll();
//		return scheme;
//	}
//	
//	@GetMapping("getSchemeNameList")
//	List<String> getNameList()
//	{
//		List<String> schemeName = repo.getNameList();
//		return schemeName;
//		
//	}
//	
//	@GetMapping("getSchemeId")
//	List<Integer> getSchemeId()
//	{
//		List<Integer> schemeId = repo.getIdList();
//		return schemeId;
//		
//	}
//
//}

package com.glm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.glm.entity.Scheme;
import com.glm.service.SchemeService;

@RestController
@CrossOrigin("http://localhost:3000")
public class SchemeController {

    @Autowired
    private SchemeService schemeService;

    @PostMapping("/AddSchemes")
    public String createScheme(@RequestBody Scheme scheme) {
        return schemeService.createScheme(scheme);
    }

    @PutMapping("/UpdateScheme")
    public String updateScheme(@RequestBody Scheme scheme) {
        return schemeService.updateScheme(scheme);
    }

    @GetMapping("getAllDetails")
    public List<Scheme> getAllSchemes() {
        return schemeService.getAllSchemes();
    }

    @GetMapping("getSchemeNameList")
    public List<String> getSchemeNameList() {
        return schemeService.getSchemeNameList();
    }

    @GetMapping("getSchemeId")
    public List<Integer> getSchemeIdList() {
        return schemeService.getSchemeIdList();
    }
}



