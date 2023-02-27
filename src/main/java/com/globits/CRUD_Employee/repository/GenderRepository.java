package com.globits.CRUD_Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globits.CRUD_Employee.entity.GenderEntity;

public interface GenderRepository extends JpaRepository<GenderEntity, Integer> {
	public GenderEntity findOneByGenderId(Integer id);
}
