package Day9;
  /*
The syntax of ScrollBy() methods is :

executeScript("window.scrollBy(x-pixels,y-pixels)");
x-pixels is the number at x-axis,
it moves to the left if number is positive and
it move to the right if number is negative .
y-pixels is the number at y-axis,
it moves to the down if number is positive and
it move to the up if number is in negative .
 */
import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class c3_JS_Examples extends TestBase {
    @Test
    public void  TC1_Handling_Window_with_js_Executer(){
        driver.get("https://www.youtube.com");
        //Now we will use java script as excuter
        // 1- We create javascriptExecutor object and we
        // cast our WebDriver type instance into JavascriptExecutor type.
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");
        //store the windows
        Set<String> windows=driver.getWindowHandles();
        for (String window:windows){
            driver.switchTo().window(window);
            String currentWindow=driver.getWindowHandle();
            System.out.println("Current Window ="+currentWindow);
            System.out.println("Title="+driver.getTitle());
        }
    }

    @Test
    public void scoll_downJS(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.get("http://demo.guru99.com/test/guru99home/");
        //java has a scroll feature
        js.executeScript("window.scrollBy(0,100)");

    }

}
