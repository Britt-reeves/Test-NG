package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

//to be able to achive singelton design pattern we will need to have priavte constructor
//no one can be able to create object from this class beacause we are making constructor priavate
public class Driver_Util {
    private Driver_Util(){


    }
    private static WebDriver driver;
    // we are using encapsulation logic in here by making driver priavate
//we will need to create getter and setter for driver

    public static WebDriver getDriver(){
        if (driver==null){
            //if our driver is null then it means we will get our driver by using properties
            String browser=PropertiesReadingUtil.getProperties("browser");

            switch (browser){
                case "chrome"://if chrome is in configuration properties than continue
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            }
        }
       return driver;
    }
    //if the driver was already defined we need another method
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
