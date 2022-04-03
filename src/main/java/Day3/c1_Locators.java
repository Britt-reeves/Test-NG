package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //linktext locator
       // driver.findElement(By.linkText("Gmail")).click();
        //partial link text locator|| the reason we use this is that we dont have to type the whole name of the link/name
        //driver.findElement(By.partialLinkText("Gma")).click();
        //The line below is: click the link by class name.
        driver.findElement(By.className("gb_d")).click();

    }
}
