import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void searchProduct(String productName){
     driver.findElement(searchBarSelector).sendKeys(productName + Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(searchResultSelector));
    }
}
