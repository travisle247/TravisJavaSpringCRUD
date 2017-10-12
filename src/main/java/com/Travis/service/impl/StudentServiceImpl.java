package com.Travis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Travis.dao.StudentDao;
import com.Travis.model.Student;
import com.Travis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Transactional
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		// TODO Auto-generated method stub
		studentDao.edit(student);

	}

	@Transactional
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		studentDao.delete(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

}
