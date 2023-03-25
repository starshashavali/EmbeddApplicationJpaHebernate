package com.compositekey.dao;

import com.compositekey.entity.StudentCompositeKey;
import com.compositekey.entity.StudentEntity;

public interface StudentADao {
	void saveStudent(StudentEntity  entity);
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
