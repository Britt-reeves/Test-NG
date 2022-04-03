package Day4;
//Implicit wait will effect all code code block where we use it
//1.open browser
//2.go to the page https://www.vinexponewyork.com/
//3.click on attend button
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_ImplicitlyWait {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //3.click on attend button
        driver.findElement(By.className("elementor-button-text")).click();
        //another way of calling by css
        //driver.findElement(By.cssSelector("a[href='/attend/']")).click();
    }
}
