package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	By loginLink=By.id("login2");
	By username=By.id("loginusername");
	By password=By.id("loginpassword");
	By login=By.xpath("//button[text()='Log in']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openApp()
	{
		driver.get("https://www.demoblaze.com/");
	}
	
	public void login(By username, By password)
	{
		driver.findElement(loginLink).click();
		driver.findElement(username).sendKeys("Revuzzz");
		driver.findElement(password).sendKeys("Revuz@123");
	}
	
	
	
	

}
