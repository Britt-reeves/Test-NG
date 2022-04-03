package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver_Util;

import java.util.concurrent.TimeUnit;

/*
      The Implicit Wait in Selenium is used to tell the web driver to
       wait for a certain amount of time before it throws a "No Such Element Exception".
      The default setting is 0. Once we set the time, the web driver will
      wait for the element for that time before throwing an exceptio
     *//*
       Explicit Wait
     The Explicit Wait in Selenium is used to tell the Web Driver to wait for
     certain conditions (Expected Conditions) or maximum time exceeded before
     throwing "ElementNotVisibleException" exception.
     It is an intelligent kind of wait, but it can be applied only for specified elements.
     */
public class c2_ExplictyWait {
    @Test
    public void TC1_ImplicitWait(){

        Driver_Util.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver_Util.getDriver().get("https://www.google.com");
        Driver_Util.getDriver().findElement(By.name("q"));
    }
    @Test
    public void TC2_ExplicitWait(){
        WebDriverWait driverWait=new WebDriverWait(Driver_Util.getDriver(),15);
        Driver_Util.getDriver().get("https:www.google.com");
        driverWait.until(ExpectedConditions.titleIs("Google"));
        WebElement GoogleSearchBox=Driver_Util.getDriver().findElement(By.name("q"));
        driverWait.until(ExpectedConditions.elementToBeClickable(GoogleSearchBox));
        driverWait.until(ExpectedConditions.visibilityOf(GoogleSearchBox));

    }

}
