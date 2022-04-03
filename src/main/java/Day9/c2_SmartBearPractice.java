package Day9;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.PropertiesReadingUtil;
import utilities.SmartBearUtils;

import java.util.List;
import java.util.Properties;

public class c2_SmartBearPractice extends TestBase {
    //inheritancw

//open chrome browser
//go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//click on box which belongs "charles Dodgeson"
//click on delete button
//verify if charles deleted from the list
@Test
    public void TC1_CharlesDeleteVerfication(){
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
    SmartBearUtils.loginForSmartBear(driver);
    //click on box which belongs "charles Dodgeson"
    WebElement CharlesCheckBox =driver.findElement(By.id("ctl00_MainContent_orderGrid"));
    CharlesCheckBox.click();

    //click delete button
    WebElement DeleteCharles=driver.findElement(By.className("btnDeleteSelected"));
    DeleteCharles.click();

    //verify if charles is deleted from the list
    List<WebElement> listofnames=driver.findElements
            (By.xpath(" //*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
    //we stored all the names

    for (WebElement eachNAME: listofnames){
        Assert.assertFalse(eachNAME.getText().equals("Charles Dodgeson"));
    }
}

}
