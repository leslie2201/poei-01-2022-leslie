import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.amazon.Mainpage;
import pageobjects.apple.CartPage;
import pageobjects.apple.MainPage;

public class AppleTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/fr/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void iphone13ProMaxAddToCartPriceTest() {
        //Arrange
        String expectedPrice ="1 379,00";
        String expectedCartTitle="Le montant total de votre Panier est de 1 379,00";
        String expectedProductName="iPhone 13 Pro Max 256 Go Bleu Alpin";
        //Act
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage=mainPage.openIphonePage()
                .openIphone13ProPage()
                .buy()
                .selectIphone13ProMax()
                .selectBlueAlpin()
                .select256Go()
                .noAppleTradeIn()
                .addToCart()
                .openCartPage();

        //Assert
        System.out.println(cartPage.getCartTitle());
        Assert.assertTrue(cartPage.getCartTitle().contains(expectedCartTitle),"le titre du panier ne correspond pas");

        Assert.assertTrue(cartPage.getProductName(0).contains(expectedProductName),"le nom du produit ne correspond pas");
        Assert.assertTrue(cartPage.getProductPrice(0).contains(expectedPrice),"le prix ne correspond pas");
        Assert.assertTrue(cartPage.getSubtotal().contains(expectedPrice),"Le sous total ne correspond pas");
        Assert.assertTrue(cartPage.getTotal().contains(expectedPrice),"Le total ne correspond pas");


    }
}
