package com.capgemini.core.gbs.service;

import java.util.List;

import com.capgemini.core.gbs.bean.Agency;
import com.capgemini.core.gbs.exception.GBException;
import com.capgemini.core.gbs.model.AgencyDAO;
import com.capgemini.core.gbs.model.AgencyDAOImpl;

public class AgencyServiceImpl implements AgencyService 
{
	private AgencyDAO agencyDAO;
	public AgencyServiceImpl() {
	agencyDAO=new AgencyDAOImpl();
	}

	@Override
	public Agency getAgency(String agencyName) throws GBException {
		// TODO Auto-generated method stub
		Agency agency=null;
		if(!isValidAgencyName(agencyName))
			throw new GBException("Invalid Age Name ");
		agency=agencyDAO.getAgency(agencyName);
		if(!isValidCylinderCount(agency))
			throw new GBException("Invalid Cylinder count");
		return agency;
	}

	private boolean isValidCylinderCount(Agency agency)throws GBException {
		// TODO Auto-generated method stub
		if(agency.getCylindercount()<0)
			return false;
		return true;
	}

	private boolean isValidAgencyName(String agencyName) throws GBException 
	{
		if(agencyName==null)
			return false;
		return true;
	}

	@Override
	public void updateAgency(Agency agency) throws GBException {
		// TODO Auto-generated method stub
		agencyDAO.updateAgency(agency);
	}

	@Override
	public List<Agency> getAllAgencies() throws GBException {
		// TODO Auto-generated method stub
		List<Agency> agencies=null;
			try {
				agencies=agencyDAO.getAllAgencyDetails();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return agencies;
	}

}
