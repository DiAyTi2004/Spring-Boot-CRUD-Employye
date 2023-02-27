package com.globits.CRUD_Employee.service;

import java.util.List;

import com.globits.CRUD_Employee.dto.EmployeeDTO;

public interface IEmployeeService {
    public List<EmployeeDTO> getAllEmployees();

    public EmployeeDTO createEmployee(EmployeeDTO employee);

    public EmployeeDTO updateEmployee(EmployeeDTO employee, Integer employeeId);

    public void deleteEmployee(Integer employeeId);
}
