package com.javahacks.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javahacks.employee.dao.EmployeeDAO;
import com.javahacks.employee.entitry.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;

	public List<Employee> findAll() {
		List<Employee> empList = new ArrayList<Employee>();
		employeeDAO.findAll().forEach(e -> empList.add(e));
		return empList;
	}

	public void addEmployee(Employee employee) {
		employeeDAO.save(employee);
	}

	public Employee getEmployee(String employeeId) {
		java.util.Optional<Employee> employee =employeeDAO.findById(employeeId);
		return employee.get();
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
		
	}

	public void deleteEmployee(String employeeId) {
		employeeDAO.deleteById(employeeId);
	}

}
