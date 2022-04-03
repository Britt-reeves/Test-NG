package Day10_Actions;

import Base.TestBase2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver_Util;

import java.sql.Driver;

public class C3_ActionsExample extends TestBase2 {

//go to http://demo.guru99.com/test/simple_context_menu.html
//double click to double click button
//then accept the alert that pops up
    Actions actions;
    @Test
    public void TC1_DoubleClick(){
        Driver_Util.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement doubleclickButton=Driver_Util.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions=new Actions(Driver_Util.getDriver());
        actions.doubleClick(doubleclickButton).perform();

        Alert alret= Driver_Util.getDriver().switchTo().alert();
        BrowserUtils.wait(2);
        alret.accept();
    }
@Test
    public void TC2_RightClick(){

    //go to http://demo.guru99.com/test/simple_context_menu.html
//right click to right click button
//then click on edit button
//then accept the allert that pops up

    Driver_Util.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
    //right click to right click button
WebElement rightclick=Driver_Util.getDriver().findElement(By.xpath(" //span.[.='right click me']"));

    actions=new Actions(Driver_Util.getDriver());
    actions.contextClick(rightclick).perform();

    WebElement editButton= Driver_Util.getDriver().findElement(By.xpath(" //span[.='Edit']"));
    editButton.click();
    //then accept the alert
    Alert alert = Driver_Util.getDriver().switchTo().alert();
    alert.accept();
}
@Test
    public void TC3_DragDrop(){
//go to http://demo.guru99.com/test/drag_drop.html
//drag bank word to account section and drop it
//then drag 5000 to amount  section and drop it
        Driver_Util.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        //1st we need to specify the location for drag element
    WebElement DragFrom=Driver_Util.getDriver().findElement(By.id("credit2"));
    //2nd specify the location of the drop
    //
    WebElement dropto=Driver_Util.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));

    actions=new Actions(Driver_Util.getDriver());
    actions.dragAndDrop(DragFrom,dropto).perform();

    WebElement dragfrom2=Driver_Util.getDriver().findElement(By.id("fourth"));//ol[@id=amt7']//li
    WebElement dropto2= Driver_Util.getDriver().findElement(By.xpath("//ol[@id='amt7']//li"));
    actions.dragAndDrop(dragfrom2,dropto2).perform();
}

}

