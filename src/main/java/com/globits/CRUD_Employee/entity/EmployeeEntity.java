package com.globits.CRUD_Employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column
	private String name;

	public EmployeeEntity(Integer employeeId, String name, Date birthDate, GenderEntity genderEntity) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.birthDate = birthDate;
		this.genderEntity = genderEntity;
	}

	@Column
	private Date birthDate;

	public EmployeeEntity() {
		super();
	}

	@ManyToOne
	@JoinColumn(name = "gender_id")
	private GenderEntity genderEntity;

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

	public GenderEntity getGenderEntity() {
		return genderEntity;
	}

	public void setGenderEntity(GenderEntity genderEntity) {
		this.genderEntity = genderEntity;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", name=" + name + ", birthDate=" + birthDate
				+ ", genderEntity=" + genderEntity + "]";
	}

}
