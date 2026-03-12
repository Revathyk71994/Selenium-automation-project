package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut1 {
	WebDriver driver;
	By fname=By.id("first-name");
	By lname=By.id("last-name");
	By zip=By.id("postal-code");
	By cont=By.id("continue");
	By fin=By.id("finish");
	
	public CheckOut1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterdetails1()
	{
		driver.findElement(fname).sendKeys("Ram");
		driver.findElement(lname).sendKeys("R");
		driver.findElement(zip).sendKeys("9899");
		driver.findElement(cont).click();
		driver.findElement(fin).click();
		
		
		
	}

}
