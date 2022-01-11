package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationAddToCartPage {

    WebDriver driver;

    int timeoutLoadPage =15;
    By proceedToCartSelector = By.cssSelector("[data-autom='proceed']");

    public ConfirmationAddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage openCartPage(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutLoadPage));
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCartSelector));
        driver.findElement(proceedToCartSelector).click();

        CartPage cartPage = new CartPage(driver);
        return  cartPage;
    }
}
