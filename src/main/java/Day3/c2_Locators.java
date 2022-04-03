package Day3;
/*
elative xpath
-- starts with //
-- double // allows you to locate your webelemt from anyehere in html code.
--more usefull wehn we compare for absulate xpath because you can start anywhere in html code
some syntax of using relative xpath
1-//tagname[@attribute='value']-- looks for tagname attribute and value
2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
3-//tagname[.='text'] --looks for exact text match for any attribute
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        // find by id;
        /*
        In interview when they ask which locator we will use he suggests that we use ID. It is very important.
        Sometimes when you use class name it is not unique, but ID is unique and special
         */
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
       // driver.findElement(By.id("nav-search-submit-text")).click();
        //xpath locator
        driver.findElement(By.xpath("//input[@type='submit']")).click();





    }
}
