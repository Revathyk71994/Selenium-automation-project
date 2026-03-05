package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver createChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-features=NewProfilePicker");
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");

        return new ChromeDriver(options);
    }
}
