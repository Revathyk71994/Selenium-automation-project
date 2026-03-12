package Test;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Pages.CartPage1;
import Pages.CheckOut1;
import Pages.LoginPage1;
import Pages.productPage1;
import Utilities.ConfigReader;
import Utilities.ExcelReader;

public class OrderTest extends BaseClass{
	@Test
public void placeorderTest()
{
		 ConfigReader config=new ConfigReader();
		BaseClass bs=new BaseClass();
		LoginPage1 lp=new LoginPage1(driver);
		ExcelReader excel=new ExcelReader();
		String username=excel.getData(1, 0);
		
		String password=excel.getData(1, 1);
		String browser=excel.getData(1, 2);


		lp.login1(username, password);
		
		//lp.login1("standard_user", "secret_sauce");
		//lp.login1(config.getUsername(),config.getPassword());
		
		
		productPage1 pp=new productPage1(driver);
		pp.cartaddt1();
		pp.viewcart1();
		CartPage1 cp=new CartPage1(driver);
		cp.checkout1();
		CheckOut1 co=new CheckOut1(driver);
		co.enterdetails1();
}
	

}
