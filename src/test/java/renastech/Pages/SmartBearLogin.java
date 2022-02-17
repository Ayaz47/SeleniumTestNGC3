package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLogin extends BasePage{
    //2. @FindBy annotation to locate webElements.
    //		-> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related webelements

    @FindBy(id="ctl00_MainContent_username")
    public WebElement userNameBox;//you assigned id locater to this element

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    //    //3. Create methods related webelements
    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;
    //if this is private you wont have access from outside
    //you will need create some methods to be able to use it

    public void loginSmartBear(String username, String password){
        //either you assign you username and passwordd from properties file
        // or just from calling method

        userNameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public String getStatusMessage(){

        return statusMessage.getText();
    }
}
