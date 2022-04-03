package Day9;

import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver_Util;
import utilities.PropertiesReadingUtil;

//go to google
//search for hello
//verify title contains hello
public class c4_Driver_Util_Practice extends TestBase2 {
    @Test
    public void TC1_Practice(){
        Driver_Util.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchbox=Driver_Util.getDriver().findElement(By.name("q"));
        String searchItem=PropertiesReadingUtil.getProperties("google_searchData");
        searchbox.sendKeys(searchItem+ Keys.ENTER);

        BrowserUtils.wait(2);
        System.out.println(Driver_Util.getDriver().getTitle());
        Assert.assertTrue(Driver_Util.getDriver().getTitle().contains(searchItem));
    }

}
