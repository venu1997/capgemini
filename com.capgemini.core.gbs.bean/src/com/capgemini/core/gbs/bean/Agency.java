package com.capgemini.core.gbs.bean;

public class Agency 
{
private String agencyName;
private String location;
private int cylindercount;
public String getAgencyName() {
	return agencyName;
}
public void setAgencyName(String agencyName) {
	this.agencyName = agencyName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getCylindercount() {
	return cylindercount;
}
public void setCylindercount(int cylindercount) {
	this.cylindercount = cylindercount;
}
public Agency(String agencyName, String location, int cylindercount) {
	super();
	this.agencyName = agencyName;
	this.location = location;
	this.cylindercount = cylindercount;
}
public Agency(String agencyName2) {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((agencyName == null) ? 0 : agencyName.hashCode());
	result = prime * result + cylindercount;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Agency other = (Agency) obj;
	if (agencyName == null) {
		if (other.agencyName != null)
			return false;
	} else if (!agencyName.equals(other.agencyName))
		return false;
	if (cylindercount != other.cylindercount)
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	return true;
}
@Override
public String toString() {
	return "Agency [agencyName=" + agencyName + ", location=" + location + ", cylindercount=" + cylindercount + "]";
}
}
