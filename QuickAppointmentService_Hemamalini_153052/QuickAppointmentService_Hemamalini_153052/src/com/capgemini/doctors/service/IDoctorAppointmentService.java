package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASException;

public interface IDoctorAppointmentService 
{

	int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASException;
	
	DoctorAppointment getDoctorAppointmentDetails(int appointmentId) throws QASException;
	
	boolean isValidPhoneNumber(DoctorAppointment doctorAppointment) ;
	
}
