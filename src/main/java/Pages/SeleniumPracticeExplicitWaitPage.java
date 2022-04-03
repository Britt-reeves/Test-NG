package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPracticeExplicitWaitPage extends BasePage  {

    public void clickTimerButton() {
    }

    public void getDefaultText() {
    }

    public WebElement webDriverText;

    //button[@onclick='timedText()']
  public class SeleniumPracticeExplicitlyWaitPage extends BasePage {

      @FindBy(xpath = "//button[@onclick='timedText()']")
      public WebElement timerButton;
      @FindBy(id="demo")
      public WebElement DefaultText;
      @FindBy(xpath = "//p[.='WebDriver']")
      public WebElement webDriverText;


      public void clickTimerButton(){
          webDriverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();
      }

      public void getDefaultText(){
          System.out.println("default text is:"+DefaultText.getText());
      }
/*
On line 41 there is a dynamic button. I was attempting to verify the name of an element but when the page loads
a new line is added. So i added the wait method for the message to appear before confirming
the name of the webelement was actually there
 */


      public WebElement getWebDriverText(){
          webDriverWait.until(ExpectedConditions.visibilityOf(webDriverText));
          return webDriverText;

      }







  }
}