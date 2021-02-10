import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class test1 {
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
    public void test1() {
        driver.get("https://www.links.hr/hr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("eu-cookie-ok")).click();
        driver.findElement(By.xpath("//div[2]/ul/li[3]/a/span/span")).click();
        driver.findElement(By.xpath("//span[contains(.,\'Fiksni telefoni\')]")).click();
        driver.findElement(By.xpath("//img[@alt=\'DECT SLUŠALICA PANASONIC RP-TCA 430E-S, 2,5mm - 20\']")).click();
    }
}
