package core.capgemini.core.eig.util;

import java.util.ArrayList;
import java.util.List;

import core.capgemini.core.eig.beans.EmployeeDetails;

public class DBUtil {

private List<EmployeeDetails> employee = new ArrayList<EmployeeDetails>();
/*{
    employee.add(new EmployeeDetails("appu","pinky","f","it"));
    employee.add(new EmployeeDetails("chinnu","honey","f","cse"));
    
}*/
public List<EmployeeDetails> getEmployee(){
	return employee;
}

public void setEmployee(List<EmployeeDetails> employee) {
    this.employee=employee;
}
}
