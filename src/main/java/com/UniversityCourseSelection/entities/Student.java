package com.UniversityCourseSelection.entities;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	@Length(max=10)
	private String studentFirstName;
	@Length(max=15)
	private String studentLastName;
	@Length(max=20)
	private String studentAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="feedbackId")
	private StudentFeedBack studentFeedBack;

	// onetomany mapping
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private List<Course> course;
	
	public StudentFeedBack getStudentFeedBack() {
		return studentFeedBack;
	}

	public void setStudentFeedBack(StudentFeedBack studentFeedBack) {
		this.studentFeedBack = studentFeedBack;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

}
