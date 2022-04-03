package Day10_Actions;

import Base.TestBase2;
import Pages.SmartBearLoginPage;
import org.testng.annotations.Test;
import utilities.Driver_Util;
import utilities.PropertiesReadingUtil;

public class c5_smartBearPomExample extends TestBase2 {


    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPositiveVerification(){
        Driver_Util.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));




    }
}
