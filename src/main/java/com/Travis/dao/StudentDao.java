package com.Travis.dao;
import java.util.List;

import com.Travis.model.*;

public interface StudentDao {

	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();
}
