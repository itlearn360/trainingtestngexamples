package _3TestNGLevel2;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _1TestNGGroup {


	@Test(groups = "login")
	public void enterUsername() {
		System.out.println("enter username");
	}

	@Test(groups = "login")
	public void enterPassword() {
		System.out.println("enter password");
	}
	@Test(groups = "login")
	public void clickonlogin() {
		System.out.println("click on login button");
	}

	@Test(groups = "searchflight")
	public void selectlocation() {
		System.out.println("select location");
	}
	@Test(groups = "searchflight")
	public void selectpreferences() {
		System.out.println("select preferenece");
	}
	@Test(groups = "searchflight")
	public void selectDate() {
		System.out.println("select dates");
	}
	@Test(groups = "searchflight")
	public void clickonsearch() {
		System.out.println("click on search");
	}
	@Test(groups = "logout")
	public void clickonlogout() {
		System.out.println("click on logout button");
		System.out.println("Logout from flight reservation system");
	}
}