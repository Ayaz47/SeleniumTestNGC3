package renastech.day10_POM_ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import renastech.Pages.SmartBearLogin;
import renastech.utilities.DriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_ExplicitWaitExample {
    /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exceptio
         */

    /*
           Explicit Wait
         The Explicit Wait in Selenium is used to tell the Web Driver to wait for
         certain conditions (Expected Conditions) or maximum time exceeded before
         throwing "ElementNotVisibleException" exception.
         It is an intelligent kind of wait, but it can be applied only for specified elements.
         */
    @Test
    public void TC1_immplicitWait(){
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverUtil.getDriver().get("https://www.google.com");
        DriverUtil.getDriver().findElement(By.name("q"));

    }
    @Test
    public void TC2_explicitWait(){

        WebDriverWait driverWait=new WebDriverWait(DriverUtil.getDriver(),15);
        DriverUtil.getDriver().get("https://www.google.com");
        driverWait.until(ExpectedConditions.titleIs("Google"));

       // DriverUtil.getDriver().findElement(By.name("q"));

        WebElement box=DriverUtil.getDriver().findElement(By.name("q"));
        driverWait.until(ExpectedConditions.visibilityOf(box));
        driverWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

    }
}
