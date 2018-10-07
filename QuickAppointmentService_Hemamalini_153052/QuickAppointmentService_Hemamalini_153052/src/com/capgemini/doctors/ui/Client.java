package com.capgemini.doctors.ui;

import java.util.Scanner;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASException;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.IDoctorAppointmentService;

public class Client 
{

	private IDoctorAppointmentService doctorAppointmentService ;

	public Client() 
	{
		doctorAppointmentService = new DoctorAppointmentService() ;
	}
	
	public void menu()
	{
		
		Scanner console = new Scanner(System.in) ;
		
		DoctorAppointment doctorAppointment = new DoctorAppointment() ;
		
		System.out.println("\n\tQUICK APPOINTMENT SERVICE APPLICATION\t");
		System.out.println("\t----- ----------- ------- -----------\t");
		System.out.println("\n");
		
		System.out.println("1) Book Doctor Appointment");
		System.out.println("2) View Doctor Appointment");
		System.out.println("3) Exit");
		
		System.out.print("\n\nEnter the choice : ");
		int choice = console.nextInt() ;
		
		switch(choice)
		{
		
		case 1 : 
			//book doctor appointment
			
			System.out.println("\n\tBOOK DOCTOR APPOINTMENT\n");
			System.out.println("\t**** ****** ***********\n");
			
			
			System.out.print("Enter Name of the patient     : ");
			String name = console.next() ;
			
			System.out.print("Enter Phone Number            : ");
			String phoneNumber = console.next() ;
			
			System.out.print("Enter Email                   : ");
			String email = console.next() ;
			
			System.out.print("Enter Age                     : ");
			int age = console.nextInt() ;
			
			System.out.print("Enter Gender                  : ");
			String gender = console.next() ;
			
			System.out.print("Enter Problem Name            : ");
			String problemName = console.next() ;
			
			doctorAppointment.setPatientName(name);
			doctorAppointment.setPhoneNumber(phoneNumber);
			doctorAppointment.setEmail(email);
			doctorAppointment.setAge(age);
			doctorAppointment.setGender(gender);
			doctorAppointment.setProblemName(problemName);
			
			try 
			{
				int appointmentId = doctorAppointmentService.addDoctorAppointmentDetails(doctorAppointment) ;
				
				System.out.println("\n\tYour Doctor Appointment has been successfully registered , your appointment ID is : "+appointmentId);
			} 
			catch (QASException e) 
			{
				// TODO Auto-generated catch block
				//exception handled inside DAO
				//System.out.println("\n\tSorry...Your problem name did not match with our doctor's speciality.");
			}
			
			break ;
			
		case 2 :
			//view doctor appointment
			
			System.out.println("\n\tVIEW DOCTOR APPOINTMENT");
			System.out.println("\t**** ****** ***********");
			
			System.out.print("\n\nEnter the appointment id  :");
			int appointmentId = console.nextInt() ;
			
			System.out.println("\n\n\n");
			
			try 
			{
				doctorAppointment = doctorAppointmentService.getDoctorAppointmentDetails(appointmentId) ;
				
				System.out.println("Patient Name              : "+doctorAppointment.getPatientName()) ;
				System.out.println("Appointment Status        : "+doctorAppointment.getAppointmentStatus());
				System.out.println("Docotor Name              : "+doctorAppointment.getDoctorName());
				
				System.out.println("\n\tAppointment Date and time, along with doctors's phone number will be shared shortly with you.");
			} 
			
			catch (QASException e) 
			{
				// TODO Auto-generated catch block
				//exception handled inside DAO
				//System.out.println("Sorry...something went wrong..Your appointment id doesnot exist");
			}
			
			break ;
			
		case 3 :
			//exit from the application
			
			System.out.println("\n\tApplication terminated successfully");
			System.exit(0) ;
			
			break ;
			
		default :
			
			System.out.println("Invalid choice");
			break ;
					
		}
	}
	
	public static void main(String[] args) 
	{
		
		Client client = new Client() ;
		
		while(true)
			client.menu();
		
	}
	
	
}
