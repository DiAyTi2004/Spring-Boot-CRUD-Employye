package com.globits.CRUD_Employee.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globits.CRUD_Employee.dto.EmployeeDTO;
import com.globits.CRUD_Employee.entity.EmployeeEntity;
import com.globits.CRUD_Employee.entity.GenderEntity;
import com.globits.CRUD_Employee.repository.EmployeeRepository;
import com.globits.CRUD_Employee.repository.GenderRepository;
import com.globits.CRUD_Employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private GenderRepository genderRepository;

	public EmployeeEntity toEntity(EmployeeDTO dto) {
		Integer id = dto.getEmployeeId();
		String name = dto.getName();
		Date birthDate = dto.getBirthDate();
		GenderEntity genderEntity = genderRepository.findOneByGenderId(dto.getGender());
		return new EmployeeEntity(id, name, birthDate, genderEntity);
	}

	public EmployeeDTO toDTO(EmployeeEntity entity) {
		Integer id = entity.getEmployeeId();
		String name = entity.getName();
		Date birthDate = entity.getBirthDate();
		Integer genderId = entity.getGenderEntity().getGenderId();
		return new EmployeeDTO(id, name, birthDate, genderId);
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeEntity> entities = employeeRepository.findAll();
		List<EmployeeDTO> dtos = new ArrayList<EmployeeDTO>();
		for (EmployeeEntity entity : entities) {
			dtos.add(toDTO(entity));
		}
		return dtos;
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employee) {
		EmployeeEntity entity = toEntity(employee);
		EmployeeEntity resEntity = employeeRepository.save(entity);
		return toDTO(resEntity);
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employee, Integer employeeId) {
		employee.setEmployeeId(employeeId);
		EmployeeEntity entity = toEntity(employee);
		EmployeeEntity resEntity = employeeRepository.save(entity);
		return toDTO(resEntity);
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
