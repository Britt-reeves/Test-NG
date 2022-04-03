package Day4;
/*Navigate to https://courses.letskodeit.com/practice
        click on BMW RADIO button
        verify that its selected*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class Radio_Buttons {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click on BMW radio Button
        WebElement BMWRadioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
            BMWRadioButton.click();

            boolean BMWRadioisSelected= BMWRadioButton.isSelected();
            if (BMWRadioisSelected){
                System.out.println("The BMW Button is selected");
            }else{
                System.out.println("The BMW button is not selected; Verification failed");
            }

            WebElement HondaButton=driver.findElement(By.id("hondaradio"));
            //verify honda button is not selected
            if (HondaButton.isSelected()){
                System.out.println("honda button is not selected; verification passed");
            }else {
                System.out.println("Honda button is selected; verfication failed");
            }


    }
}
