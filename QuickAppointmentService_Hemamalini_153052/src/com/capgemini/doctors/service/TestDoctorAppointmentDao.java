package com.capgemini.doctors.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exceptions.QASException;

public class TestDoctorAppointmentDao {

	private static IDoctorAppointmentDao doctorAppointmentDao ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		doctorAppointmentDao = new DoctorAppointmentDao() ;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		doctorAppointmentDao = null ;
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test(expected=NullPointerException.class)
	public void testAddDoctorAppointmentDetails() 
	{
		try 
		{
			doctorAppointmentDao.addDoctorAppointmentDetails(null) ;
		} 
		catch (QASException e) {
			// TODO Auto-generated catch block
			System.out.println("Null Pointer Exception");
		}
	}
	
	@Test
	public void testAddDoctorAppointmentDetails1() 
	{
		DoctorAppointment doctorAppointment = new DoctorAppointment("Anu", "9123456780", "anu.soman@gmail.com", "Female", 38, "Bone") ;
		try 
		{
			doctorAppointmentDao.addDoctorAppointmentDetails(doctorAppointment) ;
		} 
		catch (QASException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Illegal Argument Exception");
		}
		
	}

	@Test(expected=NullPointerException.class)
	public void testGetAppointmentDetails() 
	{
		
		try 
		{
			doctorAppointmentDao.getAppointmentDetails(-1000) ;
		} 
		catch (QASException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Invaid appointment Id");
		}
	}
	
	@Test
	public void testGetAppointmentDetails1() 
	{
		
		DoctorAppointment doctorAppointment1 = new DoctorAppointment("Anu", "9123456780", "anu.soman@gmail.com", "Female", 38, "Bone") ;
		
		DoctorAppointment doctorAppointment2 = null ;
		int appointmentId = 0;
		try 
		{
			appointmentId = doctorAppointmentDao.addDoctorAppointmentDetails(doctorAppointment1);
		} 
		catch (QASException e1) 
		{
			// TODO Auto-generated catch block
			
		}
		
		try 
		{
			doctorAppointment2=doctorAppointmentDao.getAppointmentDetails(appointmentId) ;
		} 
		catch (QASException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Invaid appointment Id");
		}
		
		assertNotEquals(null, doctorAppointment2);
	}
	

}
