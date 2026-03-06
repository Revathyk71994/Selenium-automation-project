package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class placeOrder {
	
	WebDriver driver;
	By  name=By.id("name");
	By country=By.id("country");
	By city=By.id("city");
	By card=By.id("card");
	By month=By.id("month");
	By year=By.id("year");
	By purchase=By.xpath("//button[text()='Purchase']");
	
	
	
	public placeOrder(WebDriver driver) {
		this.driver=driver;
	}
	public void filldetails(String n,String cou,String ci,String ca,String mon,String yr)
	{
		driver.findElement(name).sendKeys(n);
		driver.findElement(country).sendKeys(cou);
		driver.findElement(city).sendKeys(ci);
		driver.findElement(card).sendKeys(ca);
		driver.findElement(month).sendKeys(mon);
		driver.findElement(year).sendKeys(yr);
		driver.findElement(purchase).click();
	}

}
