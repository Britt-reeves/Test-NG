package M9;
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text

//    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application  with given credentials
//    (you need to enter your email in order to get credentials in advance)

import Base.TestBase2;
import Pages.SmartBearLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver_Util;
import utilities.PropertiesReadingUtil;
import utilities.WebDriverUtil;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//    Step 1) Go to Guru99 Demo Site   http://demo.guru99.com/V4/
//    Step 2) In Login page check text "Guru99 Bank" is present
//    Step 3) Login into application  with given credentials(you need
//    to enter your email in order to get credentials in advance)
public class Login extends TestBase2 {

   WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
}
    GuruLoginPage guruLoginPage;
    @Test
    public void TC1_NegativeTest() {
        Driver_Util.getDriver().get(PropertiesReadingUtil.getProperties("Guru99_url"));
        guruLoginPage = new GuruLoginPage();
        guruLoginPage.loginGuruPage(PropertiesReadingUtil.getProperties("Guru99_UserID"),
                PropertiesReadingUtil.getProperties("Guru99_Password"));

        try {
            driver.findElements(By.xpath("//h2[@class='barone']"));
            System.out.println("Guru99 Bank Element is present");
        } catch (NoSuchElementException e) {
            System.out.println("Guru99 Bank Element is not present");
        }
    }
        @Test
        public void Verify_MNG_Present(){
            try {
                driver.findElements(By.xpath("//td[contains(text(),'Manger Id : mngr392206')]"));
                System.out.println("Manager ID Element is present");
            } catch (NoSuchElementException e) {
                System.out.println("Manager Id Element is not present");
            }

        }


}
