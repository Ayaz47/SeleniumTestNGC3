package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeExplicitWaitPage extends BasePage{
    //go to :http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present

    @FindBy(xpath = "//button[.='Click me to start timer']")
    public WebElement timerButton;

    @FindBy(id = "demo")
    public WebElement defaultText;

    @FindBy(xpath = "//p[.='WebDriver']")
    public WebElement webDriverText;

    public void clickTimerButton(){
      //  timerButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();

    }

    public void getDefaultText(){
        System.out.println(defaultText.getText());
    }
    public WebElement getWebDriverText(){
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        //        System.out.println("webDriverText.getText() = " + webDriverText.getText());
        return webDriverText;
    }



}
