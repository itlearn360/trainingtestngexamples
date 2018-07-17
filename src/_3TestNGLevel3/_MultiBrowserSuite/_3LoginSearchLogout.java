package _3TestNGLevel3._MultiBrowserSuite;

import java.util.Arrays;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class _3LoginSearchLogout {
	private WebDriver driver;

	@Test(dataProvider = "Paramters")
	public void Login(String username, String password, ITestContext context) {
		driver = (WebDriver) context.getAttribute("driver");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}


	@Test(dependsOnMethods = "Login")
	public void Logout() {
		System.out.println("Logout");
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@DataProvider
	public Object[][] Paramters(ITestContext context) {
		Object[][] testObjArray = null;
		System.out.println(Arrays.deepToString(context.getAttributeNames().toArray()));
		testObjArray = (Object[][]) context.getAttribute("sddata");
		return (testObjArray);
	}
}
