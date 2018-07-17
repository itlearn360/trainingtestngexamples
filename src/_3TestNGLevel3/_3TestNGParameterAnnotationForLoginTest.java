package _3TestNGLevel3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _3TestNGParameterAnnotationForLoginTest {
	private WebDriver driver;
	private String url;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver\\geckodriver.exe");
		url = "http://newtours.demoaut.com/";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(parameters = {"username","password"})
	public void Login(String username, String password) {
		driver.get(url + "/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

	}

	@Test(dependsOnMethods = "Login")
	public void logout() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@AfterClass
	public void closeBrower() {
		driver.quit();
	}
}
