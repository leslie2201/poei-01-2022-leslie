import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
      driver = new ChromeDriver();
      driver.get("https://www.amazon.fr");
      driver.manage().window().maximize();

        // Accepter cookies
        driver.findElement(By.id("sp-cc-accept")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void hpChromeBookAddToCartPriceTest() {
        //Arrange
        String productName = "HP Chromebook x360 14a-ca0000sf";
        String expectedPrice ="369,00 €";

        //Act
     Mainpage mainPage = new Mainpage(driver);
        CartPage cartPage = mainPage.searchProduct(productName)
             .openResult(0)
             .addToCart()
             .noCoverage()
             .openCart();

     //Assert
        Assert.assertEquals(cartPage.getProductPrice(0),expectedPrice);
        Assert.assertEquals(cartPage.getActiveCartSubtotal(),expectedPrice);
        Assert.assertEquals(cartPage.getBuyboxCartSubtotal(),expectedPrice);
    }

}
