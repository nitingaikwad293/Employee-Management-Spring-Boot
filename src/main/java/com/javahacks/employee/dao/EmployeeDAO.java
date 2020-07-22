package com.javahacks.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javahacks.employee.entitry.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, String> {

}
