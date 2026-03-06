package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver createWebDriver() {
        String browser = System.getProperty("browser", "edge").toLowerCase();
        try {
            if ("chrome".equals(browser)) {
                return createChromeOnly();
            }
            return createEdgeOnly();
        } catch (WebDriverException primaryFailure) {
            if ("chrome".equals(browser)) {
                return createEdgeOnly();
            }
            return createChromeOnly();
        }
    }

    public static WebDriver createChromeDriver() {
        return createWebDriver();
    }

    private static WebDriver createChromeOnly() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(getChromeOptions());
    }

    private static WebDriver createEdgeOnly() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver(getEdgeOptions());
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));

        if (headless) {
            options.addArguments("--headless=new");
        }

        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-features=NewProfilePicker");
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

        return options;
    }

    private static EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "true"));

        if (headless) {
            options.addArguments("--headless=new");
        }

        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        return options;
    }
}
