package _3TestNGLevel2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _6False_Assertion_and_SkipTestt {
	@Test
	  public void OpenLoginpage() {
	    System.out.println("Open Login page");
	  }
	  @Test
	  public void testLogin(){
		  System.out.println("Login into app");
		  Assert.assertEquals("Logged in successfully", "Logged successfully");
	  }
	  @Test(dependsOnMethods="testLogin")
	  public void testLogout(){
		  System.out.println("Logout from the system");
	  }
}
