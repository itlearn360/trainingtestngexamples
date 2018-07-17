package _3TestNGLevel2;

import org.testng.annotations.Test;

public class _4TestCasePriority {

	@Test(priority = 2)
	public void testLogin() {
		System.out.println("Login in application");
	}

	@Test(priority = 1)
	public void testOpenLoginLink() {
		System.out.println("Open login page");
	}
}
