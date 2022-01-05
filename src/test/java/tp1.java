import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class tp1 {
    //Chercher une machine à raclette sur amazon
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        //Accepter les cookies
        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void test1(){

        WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        /*driver.findElement(By.name("field-keywords"));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.xpath(""));*/

    }

    @Test
    public void test2(){

        WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        //IMPLICIT WAIT 2 seconds pour ce cas
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // sleep Method
        /*try {
            Thread.sleep(2000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        WebElement selectedProduct = driver.findElement(By.cssSelector("[data-asin='B00D2I1VK0']"));
        selectedProduct.click();
        // Adding selected product to cart
        WebElement buttonAddCart = driver.findElement(By.id("add-to-cart-button"));
        buttonAddCart.click();

    }
}
