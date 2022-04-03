package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class GoogleTestNG {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");


    }
    @Test(priority = 1)
    public void TC1_test1(){
        System.out.println("Test one is running");
        WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys("laptop", Keys.ENTER);

        String actualTitle=driver.getTitle();
        String containedTitle="laptop";

        boolean b = actualTitle.contains(containedTitle);
        Assert.assertTrue(b,"Search function failed");
    }
@AfterMethod
    public void closing(){
    driver.quit();
}







}
