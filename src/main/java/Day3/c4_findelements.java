package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class c4_findelements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.apple.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();
//A tag that has all the links. I am using tag name locator
        List<WebElement> allLinks=driver.findElements(By.name("a"));
//A means link= a tag.
        int linkWithText=0;
        int linkWithoutText=0;

        for(WebElement eachLink: allLinks){
            String elementsToText=eachLink.getText();
            System.out.println(elementsToText);

            if (elementsToText.isEmpty()){
                linkWithoutText++;
            }else{
                linkWithText++;
            }
        }
        System.out.println("Link with text ="+linkWithText);
        System.out.println("link without text="+linkWithoutText);
        System.out.println("The link size is: "+allLinks.size());
    }
}
