package core.capgemini.core.eig.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import core.capgemini.core.eig.beans.EmployeeDetails;
import core.capgemini.core.eig.exception.EIGException;

public class EmployeeIdDAOAddEmp {

	 static EmployeeIdDAOImpl employeeDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		employeeDAO= new EmployeeIdDAOImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		employeeDAO=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("test executing");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("test executed");
	}

	//1st test case
		@Test(expected=NullPointerException.class)
		public void testAddEmpId1() {
			try {
				employeeDAO.addEmployee(null);
			} catch (EIGException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2nd test case
		@Test(expected=IllegalArgumentException.class)
		public void testAddEmpId2() {
			try {
				employeeDAO.addEmployee(new EmployeeDetails());
			} catch (EIGException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//3rd test case
		@Test
		public void testAddEmpId3() {
			EmployeeDetails enqu = new EmployeeDetails("appu","pinky","f","it");
			enqu.setId(employeeDAO.generateEmployeeId());
			int obtainedresult = 0;
			try {
				obtainedresult = employeeDAO.addEmployee(enqu);
			} catch (EIGException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    int expectedresult=1002;
		    assertEquals(expectedresult,obtainedresult);
		}
		    
//		 //4th test case
//		    @Test
//			public void testAddEmpId4() {
//				EmployeeDetails enqu = new EmployeeDetails("appu","pinky","f","it");
//				EmployeeDetails enqu1 = new EmployeeDetails("appu","pinky","f","it");
//				try {
//					employeeDAO.addEmployee(enqu);
//				} catch (EIGException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				int obtainedresult=0;
//			    int expectedresult=1004;
//			    assertEquals(obtainedresult,expectedresult);
//			    
//		}
//		    

}
