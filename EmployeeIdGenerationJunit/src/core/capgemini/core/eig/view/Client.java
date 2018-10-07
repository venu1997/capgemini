package core.capgemini.core.eig.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;
import core.capgemini.core.eig.service.EmployeeIdService;
import core.capgemini.core.eig.service.EmployeeIdServiceImpl;

public class Client {

	private EmployeeIdService empservice;
	
	public Client() {
		
		empservice=new EmployeeIdServiceImpl();
		// TODO Auto-generated constructor stub
	}
	public void menu() {
		
		EmployeeDetails employee = new EmployeeDetails();
		
		System.out.println("1.add employee");
		System.out.println("2.get the employee details");
		System.out.println("3. view all details");
		System.out.println("4.exit");
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the option");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1:
			
			System.out.println("1.enter employee first name");
		     String Fname = console.next();
		     System.out.println("2.enter employee second name");
		     String Lname = console.next();
		     System.out.println("3.enter gender");
		     String gen=console.next();
		     System.out.println("4. enter interested technologies");
		     String tech=console.next();
		     EmployeeDetails employeedetails = new EmployeeDetails();
		     employeedetails.setFirstname(Fname);
		     employeedetails.setLastname(Lname);
		     employeedetails.setGender(gen);
		     employeedetails.setTechnologyInterested(tech);
		     
		     try {
				int empid=empservice.addEmployee(employeedetails);
				employeedetails.setId(empid);
				System.out.println("Employee ID  generated successfully "+empid);
				
				
			} catch (EIGException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     
		     
			break;
		case 2:
			System.out.println("Enter the employee id");
			int id = console.nextInt();
			try {
				employee=empservice.getEmployee(id);
				System.out.println("employee id"+employee.getId());
				System.out.println("First name"+employee.getFirstname());
				System.out.println("Last name"+employee.getLastname());
				System.out.println("gender"+employee.getGender());
				System.out.println("technology interested"+employee.getTechnologyInterested());
			} 
			catch (EIGException e) 
			{
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) 
			{
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 3:
			  List<EmployeeDetails> emp;
			try {
				emp = empservice.getAllEmployees();
				 Iterator<EmployeeDetails> it = emp.iterator();
				 System.out.println("Id \t Firstname \t LastName \tgender \t technologyInterested");
				 while(it.hasNext())
				 {
					 employeedetails = it.next();
					 System.out.println(employeedetails.getId() +"\t"+
							           employeedetails.getFirstname() +"\t"+
							           employeedetails.getLastname() +"\t"+
							           employeedetails.getGender() +"\t"+
							           employeedetails.getTechnologyInterested()+"\t");
				 }
			} catch (EIGException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			break;
		case 4:
			System.out.println("Existing from the current project byee...");
			System.exit(0);
			break;
		}
		
		
	}
	public static void main(String[] args) {
		Client client = new Client();
		// making sure that application will run until you close
		while(true)
			client.menu();
	}

}
