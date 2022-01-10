package pageobjects.apple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    int timeoutAppleHomeLogo = 10;
   // By productCategorySelector = By.cssSelector("#ac-globalnav > div > ul.ac-gn-list > li.ac-gn-item.ac-gn-item-menu.ac-gn-iphone > a");
    By productCategorySelector = By.cssSelector(".ac-gn-link-iphone");
    //By appleHomeLogoSelector = By.id("ac-gn-firstfocus");

    public IphonePage openIphonePage(){

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutAppleHomeLogo));
        wait.until(ExpectedConditions.elementToBeClickable(appleHomeLogoSelector));*/

        driver.findElement(productCategorySelector).click();

        IphonePage iphonePage = new IphonePage(driver);
    return iphonePage;
    }
}
