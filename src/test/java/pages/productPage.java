package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
	
	WebDriver driver;
	
	public productPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectCategory(String category)
	{
		driver.findElement(By.linkText(category)).click();
	}
public void addProducttoCart(String productName)
{
	driver.findElement(By.linkText(productName)).click();
	driver.findElement(By.linkText("Add to cart")).click();
	driver.switchTo().alert().accept();
}

}
