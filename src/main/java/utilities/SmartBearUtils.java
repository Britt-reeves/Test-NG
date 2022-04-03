package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void loginForSmartBear(WebDriver driver){
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

public static void negativeLoginForSmartBear(WebDriver driver,
                                             String UserID,String passwordID){
        //invalide username 21
    WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
    username.sendKeys(UserID);
    //Enter invalid password
    WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
    password.sendKeys(passwordID);
    WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
    login.click();

}
/*
Line 33 is about creating a new method to verfiy the street name and there is a new perameter
 */
public static void verifyStreet(WebDriver driver,String streetName) {
//to locate whole table we have to use id //table[@id='ctl00_MainContent_orderGrid']
    ////table[@id='ctl00_MainContent_orderGrid']//tr to locate all nine rows you use //tr
////table[@id='ctl00_MainContent_orderGrid']//tr to locate the 4th row use//table[@id='ctl00_MainContent_orderGrid']//tr[4]
    //to locate the street information you put->
    ////table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
    // tr= table row/ and td=table data

    List<WebElement> streetList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
    for(WebElement eachStreet:streetList){
        if (eachStreet.getText().equals(streetName)){
            Assert.assertTrue(eachStreet.getText().equals(streetName));
            return;

        }
    }
    //parameter means input
    Assert.fail("Streen name:"+streetName+"is not present on the table");

}

}
