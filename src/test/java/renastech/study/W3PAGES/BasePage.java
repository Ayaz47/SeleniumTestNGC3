package renastech.study.W3PAGES;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import renastech.utilities.DriverUtil;



public class BasePage {
    protected WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);

    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
}
