package pageobjects.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mainpage {

    WebDriver driver;

    int timeoutSearch=5;
    By searchBarSelector = By.id("twotabsearchtextbox");
    By  searchResultSelector = By.cssSelector("[data-component-type='s-search-result']");


    public Mainpage(WebDriver driver){
        this.driver=driver;
    }

    public SearchResultPage searchProduct(String productName){
            // On trouve l'element et interagir avec l'element
         driver.findElement(searchBarSelector).sendKeys(productName + Keys.ENTER);

         //Synchronisation
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
         wait.until(ExpectedConditions.elementToBeClickable(searchResultSelector));

         SearchResultPage searchResultPage = new SearchResultPage(driver);
        return searchResultPage;
    }
}
