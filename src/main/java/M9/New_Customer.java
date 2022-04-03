package M9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver_Util;

import java.nio.file.Watchable;

//Third page is for New Customer Entry Page where you need to locate :
// customer information boxes such as name,address,gender,email,password etc.
public class New_Customer extends Login{


    @Test
    public void New_Customer_Button(){
        WebElement Customer = Driver_Util.getDriver().findElement(
                By.xpath("//*[@href='addcustomerpage.php']"));
        Customer.click();

    }

}
