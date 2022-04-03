package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openweathermap.org/");
        System.out.println(driver.getTitle());

        System.out.println("The title of Open weather Map is: "+ driver.getTitle());
        String title = driver.getTitle();

        if (title.equals("")){
            System.out.println("Test case is PASS");
        }else{
            System.out.println("Test case FAIL");
        }
    }
}
