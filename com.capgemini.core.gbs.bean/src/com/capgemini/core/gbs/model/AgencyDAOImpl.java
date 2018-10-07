package com.capgemini.core.gbs.model;

import java.util.List;


import com.capgemini.core.gbs.bean.Agency;
import com.capgemini.core.gbs.exception.GBException;
import com.capgemini.core.gbs.util.DBUtil;

public class AgencyDAOImpl implements AgencyDAO 
{
	private List<Agency> agencies;
	private DBUtil dbUtil=new DBUtil();
	public AgencyDAOImpl()
	{
		agencies=DBUtil.getAgencies();
	}
	@Override
	public void updateAgency(Agency agency) throws GBException {
		
		int index=agencies.indexOf(agency);
		if(index==-1)
			throw new GBException("Agency not found with name"+agency.getAgencyName()+"\"not found");
		Agency oldAgency=new Agency(agency.getAgencyName());
		oldAgency.setCylindercount(agency.getCylindercount());

	}

	@Override
	public Agency getAgency(String agencyName) throws GBException {
		// TODO Auto-generated method stub
		int index=agencies.indexOf(new Agency(agencyName));
		if(index==-1)
			throw new GBException("Agency not found with name"+agencyName);
		return agencies.get(index);
	}

	@Override
	public List<Agency> getAllAgencyDetails() throws Exception {
		// TODO Auto-generated method stub
		return agencies;
	}

}
