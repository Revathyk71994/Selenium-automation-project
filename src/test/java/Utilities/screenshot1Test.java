package Utilities;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot1Test {
	
	public static void takeScreenShot(WebDriver driver,String filename){
		try 
		{
			String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(System.getProperty("user.dir")+"/screenshot/"+filename+"_"+timestamp+".png");
			FileUtils.copyFile(src, dest);
			System.out.println("screenshot captured");
			
		}
		catch(Exception e)
		{
			System.out.println("screenshot captured failed");

		}
		
		
	}

}
