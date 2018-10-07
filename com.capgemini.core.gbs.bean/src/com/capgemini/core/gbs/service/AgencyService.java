package com.capgemini.core.gbs.service;

import java.util.List;

import com.capgemini.core.gbs.bean.Agency;
import com.capgemini.core.gbs.exception.GBException;


public interface AgencyService 
{
	public Agency getAgency(String agencyName)throws GBException;
	public void updateAgency(Agency agency) throws GBException;
	public List<Agency> getAllAgencies() throws GBException;
}
