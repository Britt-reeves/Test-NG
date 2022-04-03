package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
        //tagname[.='text']
        //xpath--looks for exact text match for attribute
       WebElement TestingHeader= driver.findElement(By.xpath("//b[.='Testing']"));
        System.out.println(TestingHeader.getText());

        //xpath|| 3rd way, tagname that contains the attribute.Locate webelement with the given value
       // WebElement SapHeader=driver.findElement(By.xpath())

        //absolute xpath method- we need to provide all of the codes and the way
        WebElement TestingHeader2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b"));

        /*fin
        The interview question
        The ID locator is great because it is unique
        The Xpath is  useful because if there is no ID you can still locate it
     z
         */
    }
}
