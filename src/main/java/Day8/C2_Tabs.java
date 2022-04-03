package Day8;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.Set;

//finally getting rid of web driver method
public class C2_Tabs extends TestBase {
//we use inheritance here

    @Test
    public void TC1_TabHandle() {
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow = driver.getWindowHandle(); //this will store only one window
        System.out.println("Current window: " + currentWindow);
        System.out.println("Get title: " + driver.getTitle());

        WebElement openTabButton = driver.findElement(By.id("open-tab"));
        openTabButton.click();
        System.out.println("after clicking tab button title: " + driver.getTitle());


        Set<String> allWindows=driver.getWindowHandles();//this will store all tabs(windows)
        for(String tab:allWindows){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());

        }
    }}