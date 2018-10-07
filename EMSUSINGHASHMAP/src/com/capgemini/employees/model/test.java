package com.capgemini.employees.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.capgemini.employees.exception.EmployeeException;



public class test {
	private static IEmployeeDao employeeDao ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	
		employeeDao = new EmployeeDao();
	}

	@Before
	public void setUp() throws Exception {
		employeeDao = null;
	}

	@After
	public void tearDown() throws Exception {
	}
//
//	@Test(expected=NullPointerException.class)
//	public void testgenerateEmployeeId() {
//       try 
//		{
//			employeeDao.getEmployee(0);
//		} 
//		catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Null Pointer Exception");
//		}
//	}

	@Test(expected=NullPointerException.class)
	public void testaddEmployeeDetails() {
       try 
		{
			employeeDao.addEmployeeDetails(null) ;
		} 
		catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println("Null Pointer Exception");
		}
	}

	@Test(expected=NullPointerException.class)
	public void testGetEmployee() 
	{
		
		try 
		{
			employeeDao.getEmployee(-1000) ;
		} 
		catch (EmployeeException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Invaid appointment Id");
		}
	}
}
