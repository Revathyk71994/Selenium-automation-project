package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage1 {
	WebDriver driver;
	By addtocart=By.id("add-to-cart-sauce-labs-backpack");
	By cart=By.xpath("//a[@class='shopping_cart_link']");
	
	public productPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void cartaddt1()
	{
		driver.findElement(addtocart).click();
		
	}
	public void viewcart1()
	{
		driver.findElement(cart).click();
		
	}

}
