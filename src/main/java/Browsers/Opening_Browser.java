package Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Opening_Browser {

    public static WebDriver driver;
   static String Browser1 = "chrome";
    static String Browser = "firefox";



    public static void main(String[] args) {
        if(Browser1.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://amazon.com");
        }else if (Browser1.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://rediff.com");
        }else {
            WebDriverManager.firefoxdriver().setup();
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get("http://skyscanner.com");
        }



    }
}
/*
interview question: why can we not open any website with www in selenium?

 */