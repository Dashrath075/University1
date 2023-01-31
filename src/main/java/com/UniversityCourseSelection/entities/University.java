package com.UniversityCourseSelection.entities;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class University {
	@Id
	private long universityId;
	@Length(max=20)
	@NotBlank
	private String universityName;
	@Length(max=20)
	@NotBlank
	private String universityAddress;
	@Length(max=20)
	private String country;

	// OneToMany (one university can have manyStudents)
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "universityCode")
	private List<Student> student;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "universityCode")
	private List<Staff> staff;

	public long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(long universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public University(long universityId,  String universityName, String universityAddress, String country) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.universityAddress = universityAddress;
		this.country = country;
	}

	public University() {
		super();
	}

	
}
