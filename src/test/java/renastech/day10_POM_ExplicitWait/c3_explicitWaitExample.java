package renastech.day10_POM_ExplicitWait;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SeleniumPracticeExplicitWaitPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import renastech.utilities.browserUtils;

public class c3_explicitWaitExample extends TestBase2 {
    //go to :http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present
    SeleniumPracticeExplicitWaitPage seleniumPracticeExplicitWaitPage;
    @Test
    public void TC1(){
        seleniumPracticeExplicitWaitPage=new SeleniumPracticeExplicitWaitPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
      //  seleniumPracticeExplicitWaitPage.timerButton.click();// you can also create a method in page class and call it here instead
        seleniumPracticeExplicitWaitPage.getDefaultText();
        seleniumPracticeExplicitWaitPage.clickTimerButton();
        seleniumPracticeExplicitWaitPage.getDefaultText();
      //  browserUtils.wait(3);
       WebElement actualText= seleniumPracticeExplicitWaitPage.getWebDriverText();
        seleniumPracticeExplicitWaitPage.getDefaultText();

        Assert.assertEquals(actualText.getText(),"WebDriver","Webdriver text is not present on the page");
    }
}

//we have extended TestBase2 using logic of inheritence
//we get before and after methods
//we create page class SeleniumPracticeExplicitWaitPage
//and we stored web elements and some usefull methods
//create an object from page to be able to call webelements and methods
//you navigate your url with using properties file and properties util
//then you click on time
//then you waited until webdriver text to be present
//then verify your text was present




