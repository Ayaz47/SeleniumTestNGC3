package renastech.study.W3PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import renastech.utilities.DriverUtil;

public class TryItPage extends BasePage {
    @FindBy(id="iframeResult")
    public WebElement tryitFrame;

    @FindBy(xpath = "//button[@onclick='myFunction()']")
    public WebElement tryButton;

    @FindBy(xpath = "//p[@id='demo']")
    public WebElement actualMessageAfterTry;

    @FindBy(id = "tryhome")
    public WebElement tryHomeButton;

    public void tryItMethod(){
        tryButton.click();

    }
    public String getMessageAfterTry(){

        return actualMessageAfterTry.getText();
    }

    public void clickHomeButton(){
        tryHomeButton.click();
    }


}
