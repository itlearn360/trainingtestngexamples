package _3TestNGLevel3._MultiBrowserSuite;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class _4CloseBrowser {
	@AfterTest
	public void closeBrowser_(ITestContext context) {
		WebDriver driver = (WebDriver)context.getAttribute("driver");
		System.out.println("closing browser");
		driver.close();
	}
}
