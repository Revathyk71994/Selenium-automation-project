package tests;

import org.testng.Assert;
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
		productPage pp=new productPage(driver);
		CartPage cp=new CartPage(driver);
		placeOrder po=new placeOrder(driver);

		Assert.assertNotNull(hm);
		Assert.assertNotNull(pp);
		Assert.assertNotNull(cp);
		Assert.assertNotNull(po);
	}

}
