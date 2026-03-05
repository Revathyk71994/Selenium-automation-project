package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	By cartlink=By.linkText("Cart");
	By placeorder=By.xpath("//button[text()='Place Order']");
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openCart()
	{
		driver.findElement(cartlink).click();
	}
	public void clickPlaceorder()
	{
		driver.findElement(placeorder).click();
	}

}
