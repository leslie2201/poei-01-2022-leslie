package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IphonePage {
    WebDriver driver;

    public IphonePage(WebDriver driver) {
        this.driver = driver;

    }

    public IphonePage13ProPage openIphone13ProPage(){
      IphonePage13ProPage iphonePage13ProPage = new IphonePage13ProPage(driver);
      int timeoutClick = 10;
      By iphone13ProSelector = By.cssSelector(".chapternav-link[href='/fr/iphone-13-pro/']");

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutClick));
      wait.until(ExpectedConditions.elementToBeClickable(iphone13ProSelector));

      driver.findElement(iphone13ProSelector).click();

      return iphonePage13ProPage;
    }
}
