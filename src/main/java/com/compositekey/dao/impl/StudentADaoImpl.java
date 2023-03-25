package com.compositekey.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.compositekey.dao.StudentADao;
import com.compositekey.entity.StudentCompositeKey;
import com.compositekey.entity.StudentEntity;

public class StudentADaoImpl implements  StudentADao {
	private EntityManagerFactory factory =Persistence.createEntityManagerFactory("test");

	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
			tx.commit();
			System.out.println("Product is inserted to the Database....");
		}
		catch(Exception ex) {
			tx.rollback();
			System.out.println("Error in inserting a product...." + ex);
		}
		finally {
			entityManager.close();
		}
		
	}		
	

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
entityManager.close();
		return entity;
	}
	

}
