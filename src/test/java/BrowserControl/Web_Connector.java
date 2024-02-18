package BrowserControl;

import Utilities.Constant_Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Web_Connector {
    public static WebDriver driver;

    public static void openBrowser(){
        if (Constant_Utils.BROWSER_NAME.equalsIgnoreCase("firefox")) {
            FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments("start-maximized");
            if (Constant_Utils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                fo.addArguments("--headless");
            }
            driver = new FirefoxDriver(fo);
        } else {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("start-maximized");
            if (Constant_Utils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                co.addArguments("--headless");
            }
            driver = new ChromeDriver(co);
        }
    }

    public static void closeBrowser() {
        driver.quit();
    }
}

