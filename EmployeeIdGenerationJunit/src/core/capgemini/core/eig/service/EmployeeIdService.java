package core.capgemini.core.eig.service;

import java.util.List;

import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;


public interface EmployeeIdService {
	public int addEmployee(EmployeeDetails employee) throws EIGException;
	public EmployeeDetails getEmployee(int id)throws EIGException;
	public List<EmployeeDetails> getAllEmployees() throws EIGException;
	//public boolean isValid(EmployeeDetails employee) throws EIGException;

}
