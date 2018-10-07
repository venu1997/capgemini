package com.capgemini.core.gbs.model;

import java.util.List;

import com.capgemini.core.gbs.bean.Agency;
import com.capgemini.core.gbs.exception.GBException;



public interface AgencyDAO
{
	public void updateAgency(Agency agency) throws GBException;
	public Agency getAgency(String agencyName)throws GBException;
	public List<Agency> getAllAgencyDetails() throws Exception;
}
