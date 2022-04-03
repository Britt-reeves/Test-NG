package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utilities.Driver_Util;
import utilities.PropertiesReadingUtil;

import java.sql.Driver;

public class SmartBearLoginPage extends BasePage{
//2. @FindBy annotation to locate webElements.
    //    -> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related webelements


    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;


    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;


    //Create methods related to webelements

    public void loginSmartBear(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }


    public String getStatusMessage(){
        return statusMessage.getText();
    }




}