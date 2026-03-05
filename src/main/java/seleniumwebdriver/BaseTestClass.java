package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utils.BrowserFactory;
import Utils.DriverFactory;

public class BaseTestClass {
	
protected WebDriver driver;	
	


@BeforeMethod
    public void setUp() {
        driver = DriverFactory.createChromeDriver();
        driver.get("https://www.flipkart.com/");
    }

	
	@BeforeMethod
	public void setup()
	{
		driver=BrowserFactory.getDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		//BrowserFactory.CloseDriver();
	}
	

}
