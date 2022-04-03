package Day7;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.PackageUtils;
import utilities.SmartBearUtils;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- enter incorrect username
//4- enter wrong password
//5- click login button
//6- verify error message displayed :Invalid Login or Password.
//Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
//this method should cover step3,4,5
public class c4_SmartBearNegativeClass {

    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

    WebDriver driver;

    @BeforeMethod
        public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test(dataProvider = "testData")
    public void TC1_NegativeTest(String userID,String passwordID){
        //data provider- we can send more than one user name and password
        SmartBearUtils.negativeLoginForSmartBear(driver,userID,passwordID);
    }

    @DataProvider(name = "testData")
    public static Object[][] wrongUserCredentials(){
        return new Object[][]{

                //define what the username and password is
                {"Zelal","test"},
                {"Haci","Aria"},
                {"xx","zuhal"},
                {"Celeste","Iphone"},


        };
    }


}
