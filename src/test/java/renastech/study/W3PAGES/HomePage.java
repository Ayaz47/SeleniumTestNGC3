package renastech.study.W3PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(id = "w3loginbtn")
    public WebElement loginButton;

    public void clickloginButton(){
        loginButton.click();
    }

}
