package Day7;
//1- Open a chrome browser
//2- Go to:http://the-internet.herokuapp.com/iframe
//3- Switching by id or name attribute value.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_iFrames {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void TC1_iframe(){
        //3- Switching by id or name attribute value.

        driver.switchTo().frame("mce_0_ifr");

        WebElement MessageBox=driver.findElement(By.id("tinymce"));
        //its not empty so we need to clear it
        MessageBox.clear();
        //now send the message
        MessageBox.sendKeys("This is the message box");

        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

        //There are 2 methods to be used
        //1. driver.swithchto(.defaultcontenct- this method goes to the very beginning of the code
        //2.driver.switchto().parentFrame- you go inside one frame and there is another fram inside of it. i
        //does not go to the beginning of the code, it only goes to the parent code
    }

}
