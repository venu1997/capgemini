package core.capgemini.core.eig.model;

import java.util.List;

import javax.naming.InvalidNameException;

import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;
import core.capgemini.core.eig.util.DBUtil;

public class EmployeeIdDAOImpl implements EmployeeIdDAO {
	private List<EmployeeDetails> employeedetails;
	private DBUtil dbutil = new DBUtil();
	
    private int employeeId=1000;
    public EmployeeIdDAOImpl() {
    	employeedetails=dbutil.getEmployee();
    }
	
	public int generateEmployeeId() {
		
		return ++employeeId;
	}
	@Override
	public int addEmployee(EmployeeDetails employee) throws EIGException {
		// TODO Auto-generated method stub

		if(employee==null)
			throw new NullPointerException();
		if(employee.getFirstname()==null && employee.getLastname()==null && employee.getGender()==null  && employee.getTechnologyInterested()==null)
			throw new IllegalArgumentException();
		if(employee.getFirstname()==null && employee.getLastname()==null)
			try {
				throw new InvalidNameException();
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		int empid=generateEmployeeId();
		employee.setId(empid);
		if(employeedetails.contains(employee))
		{
			return -1;
		}
		employeedetails.add(employee);
		return empid;
	}
		

	@Override
	public EmployeeDetails getEmployee(int id) throws EIGException {
		// TODO Auto-generated method stub
		int index = employeedetails.indexOf(new EmployeeDetails(id));
		if(index==-1)
			throw new EIGException("employee not found with the id"+id);
				
		return employeedetails.get(index);
	}

	@Override
	public List<EmployeeDetails> getAllEmployees() throws EIGException {
		// TODO Auto-generated method stub
		return employeedetails;
	}
	
	
	
	

}
