package com.compositekey.client;

import com.compositekey.dao.StudentADao;
import com.compositekey.dao.impl.StudentADaoImpl;
import com.compositekey.entity.StudentCompositeKey;
import com.compositekey.entity.StudentEntity;

public class Tester {

	public static void main(String[] args) {
		StudentADao dao=new StudentADaoImpl();
		
		/*
		 * create obj for composite classS
		 
		StudentCompositeKey compositeKey=new StudentCompositeKey();
		compositeKey.setRollNumber(12345);
		compositeKey.setSection("B");
		*/
		/*
		 * create obj for entity class
		 
		
		StudentEntity entity= new StudentEntity();
		entity.setStudentName("raju");
		entity.setMarks(899);
		entity.setCompositeKey(compositeKey);
		
		dao.saveStudent(entity);
		*/
		/*
		 * fetch record 
		 */
		StudentCompositeKey compositeKey=new StudentCompositeKey();
		compositeKey.setRollNumber(12345);
		compositeKey.setSection("B");
		StudentEntity entity=dao.fetchStudent(compositeKey);
		System.out.println(entity.getStudentName()+" sname");
		System.out.println(entity.getMarks()+"smarks");
		
		
		
		
		
		
		
	}

}
