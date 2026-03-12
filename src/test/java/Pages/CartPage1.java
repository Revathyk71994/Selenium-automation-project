package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage1 {
	
	WebDriver driver;
	
	By checkout1=By.id("checkout");
	
	public CartPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkout1() 
	{
		driver.findElement(checkout1).click();
	}

}
