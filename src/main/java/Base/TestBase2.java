package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.Driver_Util;

import java.util.concurrent.TimeUnit;

public class TestBase2 {
    //This will be an abstract

    @BeforeMethod
    public void setUp(){
        Driver_Util.getDriver().manage().window().maximize();
        Driver_Util.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void Closing()throws InterruptedException{
        BrowserUtils.wait(3);
      //  Driver_Util.closeDriver();
    }

}
