package com.capgemini.employees.model;

import java.util.HashMap;
import java.util.Map;


import com.capgemini.employees.bean.Employee;
import com.capgemini.employees.exception.EmployeeException;

public class EmployeeDao implements IEmployeeDao {
    
	Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	
	//generate random appointmentId
		public int generateEmployeeId()
		{
			double randomNumber = Math.random() ;
				
			return (int) (randomNumber * 1000) ;
		}
	
	@Override
	public int addEmployeeDetails(Employee employee) throws EmployeeException {
		if(employee==null)
		throw new NullPointerException();
		employee.setEmployeeId(generateEmployeeId());
		employees.put(employee.getEmployeeId(), employee);
	    return employee.getEmployeeId();
	}


	@Override
	public Employee getEmployee(int employeeId) throws EmployeeException {
		if(employeeId < 0)
			throw new NullPointerException() ;
		Employee employee = null;
		employee = employees.get(employeeId) ;
//		if(employee==null)
//			throw new EmployeeException("\n\tSorry, employee Id : "+employeeId+" doesnot exist") ;
//		
		return employee;
	}

	

}
