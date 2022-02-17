package renastech.study.W3PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "modalusername")
    public WebElement usernameBox;

    @FindBy(id="current-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='_1VfsI _OD95i _3_H0V']")
    public WebElement loginButton;


    public void logintoThePage(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
}
