package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import BaseTest.BaseClass;
import Utilities.ExtentReport;
import Utilities.Screenshot;

public class TestListener implements ITestListener

{
	          
	ExtentReports extent=ExtentReport.getReportInstance();
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result)
	{
		
		test=extent.createTest(result.getMethod().getMethodName());
		
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		
test.pass("Test passed");	

WebDriver driver=BaseClass.driver;
String path=Screenshot.captureScreenshot(driver, result.getMethod().getMethodName());
test.addScreenCaptureFromPath(path);

		
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		
test.fail(result.getThrowable());
		
	}
	public void onTestSkipped(ITestResult result)
	{
		
test.skip("Test Skiped")	;	
		
	}
	
	public void onFinish(org.testng.ITestContext context)
	{
		
extent.flush();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
