import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tp1 {

    //Chercher une machine à raclette sur amazon

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000);  // mecanisme à eviter
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Accepter les cookies

        WebElement buttonCookies = driver.findElement(By.id("sp-cc-accept"));
        buttonCookies.click();
        WebElement barreRecherche = driver.findElement(By.id("twotabsearchtextbox"));
        barreRecherche.sendKeys("machine a raclette");
        barreRecherche.sendKeys(Keys.ENTER);

        /*driver.findElement(By.name("field-keywords"));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.xpath(""));*/

        driver.quit();


    }

    @Test
    public void test2(){

    }
}
