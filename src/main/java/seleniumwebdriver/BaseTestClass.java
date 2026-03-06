package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.DriverFactory;

public class BaseTestClass {
	
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		createDriver();
		String baseUrl = System.getProperty("baseUrl", "https://www.demoblaze.com/");
		navigateWithRetry(baseUrl, 3);
	}

	private void createDriver() {
		driver = DriverFactory.createWebDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}

	private void navigateWithRetry(String url, int maxAttempts) {
		int attempt = 0;
		while (attempt < maxAttempts) {
			try {
				driver.get(url);
				return;
			} catch (WebDriverException e) {
				attempt++;
				if (attempt >= maxAttempts) {
					throw e;
				}
				safeQuitDriver();
				createDriver();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
					throw new RuntimeException(ie);
				}
			}
		}
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		safeQuitDriver();
	}

	private void safeQuitDriver() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception ignored) {
				// ignore shutdown errors
			} finally {
				driver = null;
			}
		}
	}
	

}
