package com.capgemini.employees.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


import com.capgemini.employees.bean.Employee;
import com.capgemini.employees.exception.EmployeeException;
import com.capgemini.employees.service.EmployeeService;
import com.capgemini.employees.service.IEmployeeService;

public class Client
{
	private IEmployeeService employeeService;
	
	
public Client() {
		employeeService = new EmployeeService();
	}

public void menu()
{
	
	Scanner console = new Scanner(System.in) ;
	Employee employee = new Employee();
	System.out.println("1) enter employee details");
	System.out.println("2) get employee details");
	System.out.println("3) Exit");
	
	System.out.print("\n\nEnter the choice : ");
	int choice = console.nextInt() ;
	
	switch(choice)
	{
	
	case 1 : 
		System.out.println("Enter employee name :");
		String employeeName = console.next();
		System.out.println("enter employee department :");
		String employeeDepartment = console.next();
		System.out.println("enter employee phone number:");
		String phoneNumber = console.next();
		System.out.println("Enter employee age: ");
		int age = console.nextInt();
		System.out.println("enter employee gender :");
		String gender = console.next();
		System.out.println("enter employee email:");
		String gmail = console.next();
		System.out.println("enter employee dateofbirth in the format dd-mm-yyyy");
		String dateofbirth = console.next();
		
		employee.setEmployeeName(employeeName);
		employee.setEmployeeDepartment(employeeDepartment);
		employee.setPhoneNumber(phoneNumber);
		employee.setAge(age);
		employee.setGender(gender);
		employee.setGmail(gmail);
		employee.setDateofbirth(convertToDate(dateofbirth));
		
		try
		{
			int employeeId = employeeService.addEmployeeDetails(employee);
			System.out.println("\n\tYour employee details has been successfully registered , your appointment ID is : "+employeeId);
			LocalDate date1 = LocalDate.now();
			System.out.println("local date:" +date1);
		}
		catch (EmployeeException e) 
		{
			e.printStackTrace();
		}
		
	break;
	
	case 2 : 
		 System.out.println("Getting employee details");
		 
		 System.out.println("------------------------");
		 
		 System.out.println("Enter employee id generated");
		 
		 int employeeId = console.nextInt();
		 try
		 {
			 employee = employeeService.getEmployee(employeeId);
			 
			 System.out.println("Employee Name:"  + employee.getEmployeeName());
			 System.out.println("Employee department:" + employee.getEmployeeDepartment());
			 System.out.println("Employee PhoneNumber: " + employee.getPhoneNumber());
			 System.out.println("Employee age :" +   employee.getAge());
			 System.out.println("Employee gender:" + employee.getGender());
			 System.out.println("Employee gmail:" +  employee.getGmail());
			 System.out.println("Employee dateofbirth:" + employee.getDateofbirth());
		 }
		 catch (EmployeeException e) {
			e.printStackTrace();
		}
	break;
	case 3:
		System.out.println("\n\tApplication terminated successfully");
		System.exit(0) ;
		
		break;
	default :
		System.out.println("Invalid choice");
		break ;	
		
	}
	
}	
	
public Date convertToDate(String dateInString)
{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate localdate=LocalDate.parse(dateInString, formatter);
	java.sql.Date date = java.sql.Date.valueOf(localdate);
	return date;
}
	
	
public static void main(String[] args) 
{
	Client client = new Client() ;
	
	while(true)
		client.menu();
}
}
