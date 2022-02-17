package renastech.day10_POM_ExplicitWait;

import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SmartBearLogin;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c1_SmartBearNegativeLogin extends TestBase2 {
    SmartBearLogin smartBearLogin;//null object
    //enter wrong username
    //enter wrong password
    //verify text is present
    @Test
    public void TC1_SBNegativeTest(){
        smartBearLogin=new SmartBearLogin();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
//        WebElement statusElement=smartBearLoginPage.getStatusMassegeElement();
//        String actualText=statusElement.getText();
        smartBearLogin.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_Invalidusername"
        ), PropertiesReadingUtil.getProperties("SmartBear_Invalidpassword"));

        String expectedMessage="Invalid Login or Password.";
        //importt
        String actualText=smartBearLogin.getStatusMessage();
        Assert.assertEquals(expectedMessage,actualText,"negative login failed!");

    }
}

//we have extended TestBase2 using logic of inheritence
//we get before and after methods
    //and we stored web elements and some usefull methods
//create an object from page to be able to call webelements and methods
//you navigate your url
// then you pass username, password, and click on login button with one method that we created it under smartbearlogin
//then we verified text after we tried to log in with a method that again we created under smartbear login page

