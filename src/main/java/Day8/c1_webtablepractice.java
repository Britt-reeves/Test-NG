package Day8;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.SmartBearUtils;
import utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_webtablepractice {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
@Test
    public void TC_1StreetVerification(){

        SmartBearUtils.loginForSmartBear(driver);
        //when you say driver.getTitle()it pulls the actual title of the web page
    //the high lighted green on 28 is the expected title. So there is the actual and the expected.,
    Assert.assertEquals(driver.getTitle(),"Web Orders");
}
@Test(dataProvider = "TestDataForStreetName")
    public void TC_2StreetVerification(String streetName){
        SmartBearUtils.loginForSmartBear(driver);
    SmartBearUtils.verifyStreet(driver,streetName);

}
@DataProvider(name= "TestDataForStreetName")
        public static Object[][] test(){
            return new Object[][]{

                    {"17, Park Avenue"},
                    {"44, Nibluck"},
                    {"Hello world"},
                    {"45, Stone st."}
    };
}
}













