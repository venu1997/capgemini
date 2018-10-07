package com.capgemini.employees.service;


import com.capgemini.employees.bean.Employee;
import com.capgemini.employees.exception.EmployeeException;
import com.capgemini.employees.model.EmployeeDao;
import com.capgemini.employees.model.IEmployeeDao;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao;
	
	public EmployeeService() {
		//
		employeeDao = new EmployeeDao();
	}

	@Override
	public int addEmployeeDetails(Employee employee) throws EmployeeException {
		int employeeId=0;
		if(isValidPhoneNumber(employee))
		employeeId = employeeDao.addEmployeeDetails(employee);
		else
		throw new EmployeeException("\n\tInvalid Phone Number ") ;
		return employeeId;
	}

	private boolean isValidPhoneNumber(Employee employee) {

		if(employee.getPhoneNumber().length()==10)
			return true ;
		
		return false;
	}

	@Override
	public Employee getEmployee(int employeeId) throws EmployeeException {
		Employee employee = null;
		employee = employeeDao.getEmployee(employeeId);
		return employee;
	}

}
