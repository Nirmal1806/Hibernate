package com.kafka.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.Email;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class Repo {
	
	@PersistenceContext
	EntityManager em;
	
	public Session getSession()
	{
	   return (Session)em.getDelegate();
	   //em.flush();
	   
	}
	
	public void save(Object object)
	{
		getSession().save(object);
	}
}
