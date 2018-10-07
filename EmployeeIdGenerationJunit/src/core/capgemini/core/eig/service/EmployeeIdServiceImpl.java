package core.capgemini.core.eig.service;

import java.util.List;

import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;
import core.capgemini.core.eig.model.EmployeeIdDAO;
import core.capgemini.core.eig.model.EmployeeIdDAOImpl;

public class EmployeeIdServiceImpl implements EmployeeIdService {

	  private EmployeeIdDAO empidDAO;
	public EmployeeIdServiceImpl() {
		// TODO Auto-generated constructor stub
		empidDAO= new EmployeeIdDAOImpl();
	}
	@Override
	public int addEmployee(EmployeeDetails employee) throws EIGException {
		// TODO Auto-generated method stub
		int empid=0;
		//if(isValid(employee))
			empid=empidDAO.addEmployee(employee);
			return empid;
		
	}
	@Override
	public EmployeeDetails getEmployee(int id) throws EIGException {
		// TODO Auto-generated method stub
		EmployeeDetails employee=null;
		employee=empidDAO.getEmployee(id);
		
		
		return employee;
	}
	@Override
	public List<EmployeeDetails> getAllEmployees() throws EIGException {
		// TODO Auto-generated method stub
		List<EmployeeDetails> employees=null;
		employees=empidDAO.getAllEmployees();
		return employees;
		
	}
	/*@Override
	public boolean isValid(EmployeeDetails employee) throws EIGException {
		// TODO Auto-generated method stub
		return true;
	}*/
	

	
}
