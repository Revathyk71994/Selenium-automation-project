package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1{
	WebDriver driver;
	By username=By.id("user-name");
	//@FindBy(id="user-name") WebElement username;
	
	By password=By.xpath("//input[@id='password']");
	By loginbutton=By.id("login-button");
	
	
	public  LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login1(String user, String pas)
	{
		//username.sendKeys(user);
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pas);
		driver.findElement(loginbutton).click();
  	}

}
