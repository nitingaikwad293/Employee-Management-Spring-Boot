package com.javahacks.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javahacks.employee.entitry.Employee;
import com.javahacks.employee.service.EmployeeService;

@RestController 
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	@RequestMapping(path = "/employee") 
	public List<Employee> getAllEmployee(){
		return employeeService.findAll();
	}
	
	@RequestMapping(path = "/employee",method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(path = "/employee/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(path = "/employee" ,method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		
	}

	@RequestMapping(path = "//employee/{employeeId}")
	public void deleteEmployee(@PathVariable String employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	
}
