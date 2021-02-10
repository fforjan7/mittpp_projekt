import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test4() {
        driver.get("https://www.links.hr/hr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("eu-cookie-ok")).click();
        driver.findElement(By.xpath("//span[contains(.,\'Monitori\')]")).click();
        js.executeScript("window.scrollTo(0,1300)");
        driver.findElement(By.xpath("(//a[contains(text(),\'prikaži sve\')])[4]")).click();
        driver.findElement(By.xpath("//img[@alt=\'Monitor 24\" AOC C24G1, 144Hz, 1ms, 250cd/m2, 80000000:1, crni\']")).click();
        driver.findElement(By.xpath("//button[@id=\'add-to-cart-button-85585\']")).click();
        driver.findElement(By.cssSelector(".priceHolder > .title")).click();
        driver.findElement(By.id("cart-subtotal")).click();
        driver.findElement(By.cssSelector(".common-buttons > .btn-delete")).click();
    }

}

