package core.capgemini.core.eig.model;

import java.util.List;

import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;

public interface EmployeeIdDAO {

	public int addEmployee(EmployeeDetails employee) throws EIGException;
	public EmployeeDetails getEmployee(int id)throws EIGException;
	public List<EmployeeDetails> getAllEmployees() throws EIGException;
}
