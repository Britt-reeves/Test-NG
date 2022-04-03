package Day8;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C3_Windows extends TestBase {

    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        System.out.println("Before clicking new window title: "+driver.getTitle());

        WebElement openWindowButton= driver.findElement(By.id("open-window"));
        openWindowButton.click();
        //after clicking, now we have 2 windows
        //be able to work on second window change selenium focus on next window
        Set<String> AllWindow=driver.getWindowHandles();
        //store all windows
        List<String>WindowList=new ArrayList<>();

        for (String Newwindow: AllWindow){
            WindowList.add(Newwindow);

            driver.switchTo().window(Newwindow);
            System.out.println("After switch get title"+ driver.getTitle());
        }

        driver.switchTo().window(WindowList.get(1));
        System.out.println("After Switching get title: "+ driver.getTitle());
//click on the contact link
        driver.findElement(By.xpath("(//span[.='Contact' and @class='elementor-icon-list-text'])[1]")).click();
    }

}
