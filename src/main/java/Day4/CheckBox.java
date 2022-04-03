package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver =WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkbox1= driver.findElement(By.id("vfb-6-0"));
        //make if condition to see if check box one is selected or not.
        if(checkbox1.isSelected()){
            System.out.println("Checkbox1 verification has passed");
        }else {
            System.out.println("checkbox1 verification has failed");
        }
        //Now we will click on checkbox2
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        checkbox2.click();
        //check if checkbox 2 is selected
        if (checkbox2.isSelected()){
            System.out.println("Check box 2 is selected; Verification passed");
        }else {
            System.out.println("Checkbox 2 verification has failed");
        }

    }
}
//go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish