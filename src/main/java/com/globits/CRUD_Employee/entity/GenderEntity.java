package com.globits.CRUD_Employee.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Gender")
public class GenderEntity {
	@Id
	@Column(name = "gender_id")
	private Integer genderId;

	@Column(name = "gender")
	private String gender;

	@OneToMany(mappedBy = "genderEntity")
	private List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "GenderEntity [genderId=" + genderId + ", gender=" + gender + ", employees=" + employees + "]";
	}
}
