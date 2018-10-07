package com.capgemini.employees.model;

import com.capgemini.employees.bean.Employee;
import com.capgemini.employees.exception.EmployeeException;

public interface IEmployeeDao 
{
   int addEmployeeDetails(Employee employee) throws EmployeeException;
    Employee getEmployee(int employeeId) throws EmployeeException;
 }
