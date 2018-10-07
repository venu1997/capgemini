package com.capgemini.doctors.service;

import javax.print.Doc;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exceptions.QASException;

public class DoctorAppointmentService implements IDoctorAppointmentService {

	private IDoctorAppointmentDao doctorAppointmentDao ;
	
	
	public DoctorAppointmentService() 
	{
		doctorAppointmentDao = new DoctorAppointmentDao() ;
	}
	
	
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASException
	{
		// TODO Auto-generated method stub
		
		int appointmentId = 0 ;
		
		//phone number validation
		if(isValidPhoneNumber(doctorAppointment))
			appointmentId = doctorAppointmentDao.addDoctorAppointmentDetails(doctorAppointment) ;
		else
			throw new QASException("\n\tInvalid Phone Number ") ;
		
		return appointmentId;
	}

	@Override
	public DoctorAppointment getDoctorAppointmentDetails(int appointmentId) throws QASException
	{
		// TODO Auto-generated method stub
		
		DoctorAppointment doctorAppointment = null ;
		
		doctorAppointment = doctorAppointmentDao.getAppointmentDetails(appointmentId) ;
		
		return doctorAppointment;
	}
	
	public boolean isValidPhoneNumber(DoctorAppointment doctorAppointment)
	{
		if(doctorAppointment.getPhoneNumber().length()==10)
			return true ;
		
		return false ;
	}
	

}
