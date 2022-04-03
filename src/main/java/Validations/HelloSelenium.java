package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        System.out.println("Current URL is: "+ driver.getCurrentUrl());
        /*
            These are the two lines of codes needed to test
            create a connection between selenium and the browser
            setup browser
         */
    }
}
