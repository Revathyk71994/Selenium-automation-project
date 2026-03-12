package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.ConfigReader;
import Utilities.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	 public static WebDriver driver;
	 
	 ConfigReader config=new ConfigReader();

public static ExtentReports extent;
    public ExtentTest test;


@BeforeSuite
    public void setUpReport() {
        extent = ExtentReport.getReportInstance();
    }

	 
	 
	//@BeforeMethod
	 @Test
	void Applaunch1()
	{
		WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
		//driver.get("https://www.saucedemo.com/");
	 // driver.get(config.getURL());
		driver.manage().window().maximize();
		  driver.get(config.getURL());


	}
@AfterMethod
	void tearDown1()
	{
		driver.quit();
	}



@AfterSuite(alwaysRun = true)
    public void flushReport() {
        if (extent != null) extent.flush();
    }


}
