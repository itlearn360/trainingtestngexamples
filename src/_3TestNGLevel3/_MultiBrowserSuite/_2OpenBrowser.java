package _3TestNGLevel3._MultiBrowserSuite;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _2OpenBrowser {
	private WebDriver driver;
	private String url;
	@BeforeTest
	public void startBrowser_() {
		System.out.println("Starting browser");
		url = "http://newtours.demoaut.com/";
	}
	@Test(parameters="browser")
	public void initaite_browser(String browser,ITestContext context){
		System.out.println(browser);
		if(browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\chromedriver_win32\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		context.setAttribute("driver", driver);
		System.out.println(Arrays.deepToString(context.getAttributeNames().toArray()));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
}
