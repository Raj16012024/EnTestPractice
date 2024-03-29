package PageObjects;

import BrowserControl.Web_Connector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Web_Connector {
    /**
     * Method to find and return the element using the given xpath
     * @param Time - duration in seconds
     * @param Xpath - Xpath of the element
     * @return
     */

    public static WebElement findElementByXpath(int Time, String Xpath) {
        return new WebDriverWait(driver, Duration.ofSeconds(Time)).until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
    }
}
