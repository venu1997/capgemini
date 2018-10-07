package core.capgemini.core.eig.beans;

public class EmployeeDetails {

	  
	 private int id;
	 private String firstname;
	 private  String lastname;
	 private  String gender;
	 private String technologyInterested;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(int id) {
		super();
		this.id = id;
	}

	public EmployeeDetails( String firstname, String lastname, String gender, String technologyInterested) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.technologyInterested = technologyInterested;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTechnologyInterested() {
		return technologyInterested;
	}

	public void setTechnologyInterested(String technologyInterested) {
		this.technologyInterested = technologyInterested;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		EmployeeDetails other = (EmployeeDetails) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", technologyInterested=" + technologyInterested + "]";
	}
	 
	  
	  
}
