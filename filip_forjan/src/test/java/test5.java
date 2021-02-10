import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class test5 {
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
    public void test5() {
        driver.get("https://www.links.hr/hr/");
        driver.manage().window().maximize();
        driver.findElement(By.id("eu-cookie-ok")).click();
        js.executeScript("window.scrollTo(0,51.20000076293945)");
        driver.findElement(By.cssSelector(".cat-25 .title")).click();
        driver.findElement(By.linkText("Elektronička licenca ADOBE, Acrobat Pro 2020, trajna licenca")).click();
        driver.findElement(By.id("add-to-wishlist-button-104161")).click();
        driver.findElement(By.cssSelector(".wishLabel")).click();
        driver.findElement(By.cssSelector(".button:nth-child(5)")).click();
    }

}

