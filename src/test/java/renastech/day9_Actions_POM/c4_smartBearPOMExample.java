package renastech.day9_Actions_POM;

import org.testng.annotations.Test;
import renastech.Pages.SmartBearLogin;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class c4_smartBearPOMExample {
//to be able to work with page you need to create an instance from page
//so you can have access to methods and webElements
    SmartBearLogin smartBearLogin;
    @Test
    public void TC1_smartBearPositiveLoginVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLogin=new SmartBearLogin();
        smartBearLogin.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));
       
    }

}
