package BaseTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class testOne {
	

	@Test
	void launch()
	{
		System.out.print("Opening application");
		
		
	}
	
	// Add main method to run the test directly
	/*public static void main(String[] args) {
		testOne test = new testOne();
		test.launch();
		System.out.println(); // Add a newline for better output formatting
	}*/
	
@BeforeMethod
void testbeforemethod()
{
	System.out.println("Before All method");
}

@AfterMethod
void aftermethod()
{
	System.out.println("After All method");	
}

@BeforeClass
void beforeclass()
{
	System.out.println("before All class");	
}
@AfterClass
void afterclass()
{
	System.out.println("before All class");	
}
@AfterSuite
void aftersuite()
{
	System.out.println("after All suites");	
}
@BeforeSuite
void beforesuite()
{
	System.out.println("before b All suites");	
}



}
