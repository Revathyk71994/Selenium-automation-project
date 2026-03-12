package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static String captureScreenshot(WebDriver driver, String testName)
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+testName+".png";
		File dest=new File(path);
		dest.getParentFile().mkdirs();
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		return path;
		
	}
}
