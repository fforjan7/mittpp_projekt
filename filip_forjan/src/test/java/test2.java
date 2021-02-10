import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.Map;

public class test2 {
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
    public void test2() {
        driver.get("https://www.links.hr/hr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("eu-cookie-ok")).click();
        driver.findElement(By.id("small-searchterms")).click();
        driver.findElement(By.id("small-searchterms")).sendKeys("iphone");
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//img[@alt=\'Smartphone APPLE iPhone 12 Pro Max, 6,7\", 128GB, plavi - Preorder\']")).click();
    }
}
