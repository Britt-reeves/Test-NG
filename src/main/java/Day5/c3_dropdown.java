/*package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverUtil;

import javax.xml.ws.Action;
import java.util.concurrent.TimeUnit;

//task1
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//confirm default selected dropdown is "Please select an option"
//task2
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//choose  option 2 from dropdown
//choose option 1 from dropdown
//choose option 2 from dropdown
public class c3_dropdown{

        WebDriver driver;
        @BeforeClass
        public void beforeclass(){
                System.out.println("before class is running ");

        }

        @AfterClass
        public void AfterClass(){
                System.out.println("after class is running");
        }


        @BeforeMethod
        public void setup(){
                driver= WebDriverUtil.getDriver("chrome");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://the-internet.herokuapp.com/");
        }
        @Test
        public void TC1_VerifyDefaultOptionInDropDOwnBox(){
                System.out.println("Tc1 is running");
                driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
                //confirm default selected dropdown is "Please select an option"
                WebElement dropdownbox=driver.findElement(By.id("dropdown"));
//We use select method line 57- it is used usually when there is a drop down option(when you need to select something) you use the select method//
                Select dropdown=new Select(dropdownbox);

                String defaultOption=dropdown.getFirstSelectedOption().getText();
                String expectedDefault="Please select an option";

                System.out.println("default option is: "+defaultOption);
                Assert.assertEquals(defaultOption,expectedDefault,"default option not\"Please select an option");
        }


        @Test
        public void TC2_verifyTestOption() throws InterruptedException {
                System.out.println("Test case 2 is running");
                //open chrome browser
                //2. go to "https://the-internet.herokuapp.com/" done
                //3. click on the drop down box

                //open chrome browser
                //Different test but the chrome browser is already up and running so we DO NOT need to open a new
                // chrome browser
                driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
                //select dropdowns are created by using <Select> tag in HTML
                //and if it is select dropdown you can handle by using Select class
                WebElement dropdownbox=driver.findElement(By.id("dropdown"));
                Select dropdown=new Select(dropdownbox);
                //Now go into the dropdown
                Thread.sleep(2000);
                dropdown.selectByVisibleText("Option 2");
                Thread.sleep(2000);
                //choose option one
                dropdown.selectByValue("1");
                Thread.sleep(2000);
                //choose option2
                dropdown.selectByIndex(2);

        }
                @AfterMethod
        public void closing(){
                driver.close();
                }


}
*/