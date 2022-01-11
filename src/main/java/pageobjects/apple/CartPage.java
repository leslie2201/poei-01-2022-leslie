package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By bagItemNameSelector=By.cssSelector("[data-autom='bag-item-name']");
    By itemPriceInfoSelector = By.cssSelector(".rs-iteminfo-price");
    By automSubTotalValueSelector = By.cssSelector("[data-autom='bagrs-summary-subtotalvalue']");
    By automTotalValueSelector = By.cssSelector("[data-autom='bagtotalvalue']");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartTitle(){
        By automBagHeaderTitleSelector = By.cssSelector("[data-autom='bag-header']");
        return driver.findElement(automBagHeaderTitleSelector).getText();
    }


    public String getProductName(int index){

        return driver.findElements(bagItemNameSelector).get(index).getText();
    }
    public String getProductPrice(int index){
        return driver.findElements(itemPriceInfoSelector).get(index).getText();
    }

    public String getSubtotal() {
        return driver.findElement(automSubTotalValueSelector).getText();
    }

    public String getTotal() {
        return driver.findElement(automTotalValueSelector).getText();
    }

}
