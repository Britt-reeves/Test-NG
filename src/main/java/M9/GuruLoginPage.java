package M9;

import Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuruLoginPage extends BasePage {

    @FindBy(name ="uid")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(name = "btnLogin")
    public WebElement loginButton;

    public void loginGuruPage(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }


}
