package com.globits.CRUD_Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globits.CRUD_Employee.dto.EmployeeDTO;
import com.globits.CRUD_Employee.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping(value = "/employee/total")
	private List<EmployeeDTO> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping(value = "/employee")
	private EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO dto) {
		return employeeService.createEmployee(dto);
	}

	@PutMapping(value = "/employee/{id}")
	private EmployeeDTO updateEmployee(@RequestBody EmployeeDTO dto, @PathVariable("id") Integer id) {
		return employeeService.updateEmployee(dto, id);
	}

	@DeleteMapping(value = "/employee/{id}")
	private void deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
	}
}
