package Day10_Actions;

import Base.TestBase2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver_Util;

import javax.swing.*;
import java.sql.Driver;

public class c4_ActioHoverOver extends TestBase2 {
    //go to http://the-internet.herokuapp.com/hovers
//move mouse to third image
//verify text of image present on the screen
    @Test
    public void TC1_HoverOver() {
        Driver_Util.getDriver().get("http://the-internet.herokuapp.com/hovers");
//h5[.='name: user3']/../preceding-sibling::img    }
        WebElement thirdImage = Driver_Util.getDriver().findElement(
                By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));

        Actions actions = new Actions(Driver_Util.getDriver());
        actions.moveToElement(thirdImage).perform();

        WebElement Image3rdText= Driver_Util.getDriver().findElement(By.xpath("//h5[.='name:user3']"
        ));
        boolean testispresent= Image3rdText.isDisplayed();
        Assert.assertTrue(testispresent,"Test is not present");
    }
}