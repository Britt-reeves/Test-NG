package Day10_Actions;

import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver_Util;

public class c2_DropDown extends TestBase2 {
    @Test
    public void Tc1_test(){
        Driver_Util.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement Dropdown=Driver_Util.getDriver().findElement(By.id("countryDropdown"));
        Dropdown.sendKeys("Canada");
        BrowserUtils.wait(3);
        Dropdown.sendKeys(Keys.ARROW_DOWN);
        Dropdown.sendKeys(Keys.ENTER);


    }


}
