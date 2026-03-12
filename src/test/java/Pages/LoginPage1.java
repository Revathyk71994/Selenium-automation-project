package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1{
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.xpath("//input[@id='password']");
	By loginbutton=By.id("login-button");
	
	
	public  LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login1(String user, String pas)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pas);
		driver.findElement(loginbutton).click();
  	}

}
