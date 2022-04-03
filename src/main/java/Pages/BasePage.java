package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver_Util;

public abstract class BasePage {
    //Our first page for object model

    protected WebDriverWait webDriverWait=new WebDriverWait(Driver_Util.getDriver(),15);
    /*

IN POM Design you need to have some structure for each page :
1.PageFactory.initElements(driver, this);
      -> It creates connection in between driver and object of the class.
2. @FindBy annotation to locate webElements.
      -> Using this FindBy annotation, help us to locate web elements.
3. Create methods related webelements

     */

    //1.PageFactory.initElements(driver, this);
    //      -> It creates connection in between driver and object of the class.
    public BasePage(){

        PageFactory.initElements(Driver_Util.getDriver(),this);

     }
}
