package com.UniversityCourseSelection.entities;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long staffId;
	@Length(max=20)
	private String staffName;
	@Length(max=25)
	private String staffRole;
	
	public Staff(long staffId, @Length(max = 20) String staffName, @Length(max = 25) String staffRole) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffRole = staffRole;
	}
	
	public Staff() {
		super();
	}

	public long getStaffId() {
		return staffId;
	}

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}
}
