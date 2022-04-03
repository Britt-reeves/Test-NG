package Day10_Actions;
/*
   Go to "http://the-internet.herokuapp.com/"
   click JavaScript Alerts
   Click for Js Prompt
   Enter "hello word" text
   Click okay
   Validate your text appearing on the page
   */
import Base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver_Util;

public class c1_Alert_Prac extends TestBase2 {
@Test
    public void AlertPractice(){
    Driver_Util.getDriver().get("http://the-internet.herokuapp.com/");
    WebElement jsAlertLink=Driver_Util.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
    jsAlertLink.click();

    WebElement JSPromptLink=Driver_Util.getDriver().findElement(By.xpath("//button[@onclick='jsPromt()']"));
    JSPromptLink.click();

    Alert alert=Driver_Util.getDriver().switchTo().alert();
    String word= "Hello World";
    jsAlertLink.sendKeys(word);
    BrowserUtils.wait(5);
    alert.accept();

    WebElement actualtext = Driver_Util.getDriver().findElement(By.id("result"));
    Assert.assertTrue(actualtext.getText().contains(word));


}



}
