package utilities;


import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application  with given credentials(you need to enter
//    your email in order to get credentials in advance)
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully



//    Hint-TestNG :
//Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer
// verify the message customer registered sucessfully.

    //    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
    public class HW9 extends TestBase2 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //Go to the above URL:http://demo.guru99.com/V4/

        driver = WebDriverUtil.getDriver("chrome");
        driver.get("http://demo.guru99.com/V4/");
    }
//    Step 2) In Login page check text "Guru99 Bank" is present
    @Test
        public void TC1_Login(){
        //*[@class="barone"]
        if( driver.findElement(By.xpath("//*[@class='barone']")).isDisplayed()){
            System.out.println("Element is present:Guru99");
        }else{
            System.out.println("Element is InVisible");
//    Step 3) Login into application  with given credentials(you need to enter
//    your email in order to get credentials in advance)


        }


    }

}
