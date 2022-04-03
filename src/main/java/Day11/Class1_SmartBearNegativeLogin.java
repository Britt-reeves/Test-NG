package Day11;

import Base.TestBase2;
import Pages.SmartBearLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver_Util;
import utilities.PropertiesReadingUtil;

public class Class1_SmartBearNegativeLogin extends TestBase2 {

    //enter valid username and password for smartbear
    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_NegativeTest(){
        Driver_Util.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_invalidUsername"),
                PropertiesReadingUtil.getProperties("SmartBear_invalidePassword"));

        String expectedMessage="Invalid Login or Password.";
        String actualText=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualText,"Negative login failed");
//we extend TestBase2 with logic of inheritence
        //we get before and after method
//we create page class
        //and we stored webelements and some usefull methods
//create an object from page to be able to call webelements and methods
//you navigate your url
//then you pass username ,password and click on login button with one method that we created under SMLogin Page
//then we verified text after we try to logged in with a method that again we create under Login Page

    }

}
