package com.capgemini.employees.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee 
{
  private int employeeId;
  private String employeeName;
  private String employeeDepartment;
  private String phoneNumber;
  private int age;
  private String gender;
  private String gmail;
  private LocalDate date;
  private Date dateofbirth;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId) {
	super();
	this.employeeId = employeeId;
}
public Employee(int employeeId, String employeeName, String employeeDepartment, String phoneNumber, int age,
		String gender, String gmail, LocalDate date, Date dateofbirth) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeDepartment = employeeDepartment;
	this.phoneNumber = phoneNumber;
	this.age = age;
	this.gender = gender;
	this.gmail = gmail;
	this.date = date;
	this.dateofbirth = dateofbirth;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Date getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employeeId;
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
	Employee other = (Employee) obj;
	if (employeeId != other.employeeId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
			+ employeeDepartment + ", phoneNumber=" + phoneNumber + ", age=" + age + ", gender=" + gender + ", gmail="
			+ gmail + ", date=" + date + ", dateofbirth=" + dateofbirth + "]";
}


}
