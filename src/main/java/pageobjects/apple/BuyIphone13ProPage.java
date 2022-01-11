package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BuyIphone13ProPage {

    WebDriver driver;
    int timeoutBuyProduct = 8;
    By automProductSelector = By.cssSelector("[data-autom='dimensionScreensize6_7inch']+label");
    By automColorSelector = By.cssSelector("[data-autom='dimensionColorsierrablue'] + label");
    By automCapacitySelector = By.cssSelector("[data-autom='dimensionCapacity256gb'] + label");
    By automAddToCartButtonSelector = By.cssSelector("[data-autom='add-to-cart']");


    public BuyIphone13ProPage(WebDriver driver) {
        this.driver = driver;
    }

    public BuyIphone13ProPage selectIphone13ProMax() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyProduct));
        wait.until(ExpectedConditions.elementToBeClickable(automProductSelector));

        try {
            Thread.sleep(500);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(automProductSelector).click();

        return this;
    }

    public BuyIphone13ProPage selectBlueAlpin() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyProduct));
        wait.until(ExpectedConditions.elementToBeClickable(automColorSelector));

        try {
            Thread.sleep(5000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(automColorSelector).click();
        return this;
    }

    public BuyIphone13ProPage select256Go() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyProduct));
        wait.until(ExpectedConditions.elementToBeClickable(automCapacitySelector));

        try {
            Thread.sleep(5000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(automCapacitySelector).click();
        return this;
    }

    public BuyIphone13ProPage noAppleTradeIn() {
        int timeoutBuyProduct = 10;
        By automNoTradeInSelector = By.cssSelector("[data-autom='choose-noTradeIn'] + label");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyProduct));
        wait.until(ExpectedConditions.elementToBeClickable(automNoTradeInSelector));

        try {
            Thread.sleep(5000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(automNoTradeInSelector).click();
        return this;
    }


    public ConfirmationAddToCartPage addToCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutBuyProduct));
        wait.until(ExpectedConditions.elementToBeClickable(automAddToCartButtonSelector));

        try {
            Thread.sleep(5000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(automAddToCartButtonSelector).click();
        ConfirmationAddToCartPage confirmationAddToCartPage = new ConfirmationAddToCartPage(driver);
        return confirmationAddToCartPage;
    }
}


