package com.glm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.glm.entity.Scheme;

public interface SchemeRepo extends JpaRepository<Scheme, Integer>{

	@Query("select NBFC from Scheme order by NBFC")
	public List<String> getNameList();
	
	@Query("select id from Scheme order by id")
	public List<Integer> getIdList();
}
