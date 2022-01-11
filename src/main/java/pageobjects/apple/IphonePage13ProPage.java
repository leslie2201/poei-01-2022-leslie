package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IphonePage13ProPage {
    WebDriver driver;

    public IphonePage13ProPage(WebDriver driver) {
        this.driver = driver;
    }


    public BuyIphone13ProPage buy(){

        int timeoutBuyButton =5;
        By buyButtonSelector = By.cssSelector(".ac-ln-button");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyButton));
        wait.until(ExpectedConditions.elementToBeClickable(buyButtonSelector));

        driver.findElement(buyButtonSelector).click();

        BuyIphone13ProPage buyIphone13ProPage = new BuyIphone13ProPage(driver);
    return buyIphone13ProPage;
    }
}
