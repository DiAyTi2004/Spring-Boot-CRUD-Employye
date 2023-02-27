package com.globits.CRUD_Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globits.CRUD_Employee.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    public List<EmployeeEntity> findAll();
}
