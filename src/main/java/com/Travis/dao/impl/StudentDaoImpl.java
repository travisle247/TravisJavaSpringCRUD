package com.Travis.dao.impl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.Travis.dao.StudentDao;
import com.Travis.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private SessionFactory session;
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);

	}

	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));

	}

	@Override
	public Student getStudent(int studentId) {
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}
	
	public List getAllStudent() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
