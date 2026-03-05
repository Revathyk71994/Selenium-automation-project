package tests;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.placeOrder;
import pages.productPage;
import seleniumwebdriver.BaseTestClass;

public class purchaseflowTest extends BaseTestClass{
	@Test
	public void verifyendtoendflow()
	{
		HomePage hm=new HomePage(driver);
		productPage pp=new productPage();
		CartPage cp=new CartPage(driver);
		placeOrder po=new placeOrder();
	}

}
