package _1testNGsimple;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//we will test is user able to see test score
// Teststeps: 1. startfirefox and OpenDashboard
// 2. Check user is logged in not
// 3.Check user test score
// 4.Logout user from application
// 5.close the firefox
public class _4SimpleTestcasewithBeforeTestAfterTest {

	@BeforeTest
	public void startFirefox_OpenDashboard() {
		System.out.println("Starting firefox");
		System.out.println("Opening dashboard link");
	}
	
	@BeforeMethod
    public void CheckUserisLoggedin(){
    	System.out.println("user is logged in");
    	System.out.println("he can access his dashboard");
    }

	@Test
	public void executeTest() {
		System.out.println("User clicked on test scores and he is able to see his test score");
	}
 
	@AfterMethod
    public void LogoutUser(){
    	System.out.println("User clicked on logout button");
    	System.out.println("User is logged out");
    }
    
	@AfterTest
	public void executeAftertest() {
		System.out.println("removing all the assets");
		System.out.println("Closing firefox");
	}

}
