package com.capgemini.core.gbs.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.core.gbs.bean.Agency;



public class DBUtil
{
	private static List<Agency> agencies=new ArrayList<Agency>();
	{
		 agencies.add(new Agency("hp","mumbai",45));
		 agencies.add(new Agency("jyothi","pune",12));
		 agencies.add(new Agency("ip","chennai",34));
		//add more
	}
	public static   List<Agency> getAgencies() {
		return agencies;
	}
	public void setAgencyDetails(List<Agency> agencies) {
		this.agencies= agencies;
	}
}
