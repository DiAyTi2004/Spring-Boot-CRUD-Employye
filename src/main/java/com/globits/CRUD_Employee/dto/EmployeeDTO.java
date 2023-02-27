package com.globits.CRUD_Employee.dto;

import java.util.Date;

public class EmployeeDTO {
	private Integer employeeId;
	private String name;
	private Date birthDate;
	private Integer gender;

	public EmployeeDTO(Integer employeeId, String name, Date birthDate, Integer gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", name=" + name + ", birthDate=" + birthDate + ", gender="
				+ gender + "]";
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

}
