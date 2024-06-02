package com.glm.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glm.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class UserRepo {
	

	@Autowired
	EntityManager em;
	
public User userLogin(String userEmail, String userPassword) {

	Query q = em.createQuery("from User log where log.userEmail =?1 and log.userPassword=?2");
	q.setParameter(1, userEmail);
	q.setParameter(2, userPassword);
	return (User) q.getSingleResult();

}

public void addUser(User user) {
	em.persist(user);

}

	

}






















//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.glm.entity.User;
//
//
//
//@Repository
//public interface UserRepo extends JpaRepository<User, Integer> {
//
//	boolean existsByuserEmail(String userEmail);
//
//	boolean existsByuserPassword(String userPassword);
//	
//
//
//
//}


