package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//before and after method
public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closing() throws InterruptedException{
        BrowserUtils.wait(3);
       //driver.close();
    }
}
