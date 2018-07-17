package _1testNGsimple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//we will test the "is HR able to see employee working days of a month"
//Teststeps:1. Get the user credentials of HR from database & initialize 
//2. startfirefox and Open login page
//3. Enter user login credentials
//4. Go to dashboard and search employee and check working days of employee
//5.Logout user from application
//6.close the firefox
//7. terminate file object or database connection
public class _5SimpleBeforeClassAfterClassAnnotation {
  
    @BeforeClass
    public void beforeClass(){
    	System.out.println("Establish connection with database");
    	System.out.println("Get the credentials and set into one object");
    }
	@BeforeTest
	public void startFirefox_OpenLoginpage() {
		System.out.println("Starting firefox");
		System.out.println("Opening login page");
	}
	
	@BeforeMethod
    public void LoginHR(){
    	System.out.println("Enter the HR credentials to username and password");
    	System.out.println("click on the login button to logged into system");
    }

	@Test
	public void executeTest() {
		System.out.println("Open the dashboard");
		System.out.println("Search the employee");
		System.out.println("Check working days of employee");
		System.out.println("Calculate his salary & Pass to financial department");
	}
 
	@AfterMethod
    public void LogoutUser(){
    	System.out.println("HR clicked on logout button");
    	System.out.println("HR is logged out");
    }
    
	@AfterTest
	public void executeAftertest() {
		System.out.println("removing all the assets");
		System.out.println("Closing firefox");
	}
	
    @AfterClass
    public void afterClass(){
    	System.out.println("terminating database connection for security");
    }
}
