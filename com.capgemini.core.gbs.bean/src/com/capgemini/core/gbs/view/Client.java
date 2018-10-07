package com.capgemini.core.gbs.view;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.core.gbs.bean.Agency;
import com.capgemini.core.gbs.exception.GBException;
import com.capgemini.core.gbs.service.AgencyService;
import com.capgemini.core.gbs.service.AgencyServiceImpl;

public class Client 
{
	private AgencyService agencyServices;
	public Client()
	{
		agencyServices=new AgencyServiceImpl();
		
	}
	public void menu()
	{
		Random rand=new Random();
		System.out.println("1.View Availability");
		System.out.println("2.Booking");
		System.out.println("3.Exit");
		Scanner console=new Scanner(System.in);
		System.out.println("Enter an option");
		int choice=console.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
				List<Agency> agencies=agencyServices.getAllAgencies();
				Iterator<Agency> it=agencies.iterator();
				System.out.println("Agency Name\tLocation\tCylindercpount");
				while(it.hasNext())
				{
					Agency agency=it.next();
					System.out.println(agency.getAgencyName()+"\t\t"+agency.getLocation()+"\t\t\t"+agency.getCylindercount());
				}
			}
			catch(GBException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("enter the agency name");
			String name=console.next();
			try
			{
				Agency agency=agencyServices.getAgency(name);
				System.out.println("Cylindercount:");
				int cylinderCount=console.nextInt();
				if(cylinderCount<0)
					throw new GBException("Invalid cylinder count");
				else if(cylinderCount<=agency.getCylindercount());
				{
					agency.setCylindercount(agency.getCylindercount()-cylinderCount);
					System.out.println("Thank you,your requestedid"+rand.nextInt()+",No of cylinders booked+");
				}
			}
			catch(GBException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Exit");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
	}
	public static void main(String[] args) 
	{
		Client client=new Client();
		while(true)
			client.menu();
	}
}
