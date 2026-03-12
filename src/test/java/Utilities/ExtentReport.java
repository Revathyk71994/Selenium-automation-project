package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	private static ExtentReports extent;	

	public static ExtentReports getReportInstance()
	{
		String stamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
		String path=System.getProperty("user.dir")+"/reports/index"+ stamp + ".html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Testing");
		reporter.config().setDocumentTitle("Test Execution Report");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Revathy");
		reporter.config().setTheme(Theme.DARK);
		
		
		return extent;
		
		
		
		
	}

	
	
	
}
