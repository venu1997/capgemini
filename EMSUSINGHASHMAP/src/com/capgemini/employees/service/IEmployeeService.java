package com.capgemini.employees.service;

import com.capgemini.employees.bean.Employee;
import com.capgemini.employees.exception.EmployeeException;

public interface IEmployeeService 
{

	   int addEmployeeDetails(Employee employee) throws EmployeeException;
	    Employee getEmployee(int employeeId) throws EmployeeException;
}
