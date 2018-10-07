package com.capgemini.doctors.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASException;

public class DoctorAppointmentDao implements IDoctorAppointmentDao 
{
	
	Map<Integer,DoctorAppointment> appointments = new HashMap<Integer,DoctorAppointment>();

	private Map<String,String> doctors = new HashMap<String,String>() ;
	{
		doctors.put("Heart", "Dr. Brijesh Kumar") ;
		doctors.put("Gynecology", "Dr. Sharda Singh") ;
		doctors.put("Diabetes", "Dr. Heena Khan") ;
		doctors.put("ENT", "Dr. Paras mal") ;
		doctors.put("Bone", "Dr. Renuka Kher") ;
		doctors.put("Dermatology", "Dr. Kanika Kapor") ;
		
	}
	
	//generate random appointmentId
	public int generateAppointmentId()
	{
		double randomNumber = Math.random() ;
			
		return (int) (randomNumber * 1000) ;
	}
		
		
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASException
	{
		// TODO Auto-generated method stub
		
		if(doctorAppointment==null)
			throw new NullPointerException() ;
		
		doctorAppointment.setAppointmentId(generateAppointmentId());
		
		String problemName = doctorAppointment.getProblemName() ;
		
		if(doctors.get(problemName)!=null)
		{
			doctorAppointment.setAppointmentDate(LocalDate.now());
			doctorAppointment.setAppointmentStatus("APPROVED");
			doctorAppointment.setDoctorName(doctors.get(problemName));
		}
		else
			throw new QASException("\n\tSorry,Problem Name doesnot exist and hence appointment could not be registered") ;
		
		appointments.put(doctorAppointment.getAppointmentId(), doctorAppointment) ;
		
		return doctorAppointment.getAppointmentId();
	}

	@Override
	public DoctorAppointment getAppointmentDetails(int appointmentId) throws QASException
	{
		// TODO Auto-generated method stub
		if(appointmentId < 0)
			throw new NullPointerException() ;
		
		DoctorAppointment doctorAppointment = null ;
		
		doctorAppointment = appointments.get(appointmentId) ;
		
		if(doctorAppointment==null)
			throw new QASException("\n\tSorry, Appointment Id : "+appointmentId+" doesnot exist") ;
		
		return doctorAppointment;
	}

}
