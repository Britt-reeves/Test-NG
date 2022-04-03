package Day2.Day6;
//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Enter username --->Tester
//4- Enter password --->test
//5- Click "Login" button
//6- Verify title equals: Web Orders

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.SmartBearUtils;
import utilities.WebDriverUtil;

import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

public class c1_Smart_bear_login {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
driver = WebDriverUtil.getDriver("chrome");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
@AfterMethod
    public void closing(){
//we want to use utility we created
    BrowserUtils.wait(2);
      //  driver.close();
}
@Test
    public void TC1_LoginVerification(){
//3- Enter username --->Tester
    WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
    username.sendKeys("Tester");
    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
    password.sendKeys("test");
WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
login.click();

String actualtitle=driver.getTitle();
String excpectedtitle="Web Orders";
    Assert.assertEquals(actualtitle,excpectedtitle);
}
@Test
    public void TC2_loginverification(){
    SmartBearUtils.loginForSmartBear(driver);
//we want to verify title equals web orders
    Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Login Failed");
}



}
