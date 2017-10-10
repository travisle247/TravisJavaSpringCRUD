package com.Travis.model;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	@Column
	private String firtName;
	@Column
	private String lastName;
	@Column
	private int yearLevel;
	
	public Student() {}
	public Student(int studentId, String firtName, String lastName, int yearLevel) {
		super();
		this.studentId = studentId;
		this.firtName = firtName;
		this.lastName = lastName;
		this.yearLevel = yearLevel;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
}
