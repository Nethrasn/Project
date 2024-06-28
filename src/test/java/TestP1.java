import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestP1 {

    @Test
    public void test() throws Exception{

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/nethravathi.sn/Downloads/chromedriver-mac-x64");
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//div/button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        driver.close();


    }

}
