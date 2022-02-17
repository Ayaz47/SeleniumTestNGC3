package renastech.day7_Windows_Tabs_Properties.homeworkNov9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.SmartBearUtils;

//Task2
//    Smartbear software product verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has product as  "ScreenSaver"
public class Task2_SmartBearScreenSaver extends TestBase {


    @Test
    public void TC1_screensaver(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtils.loginForSmartBear(driver);

        String expectedCustomerName="Mark Smith";
        String expectedProduct="ScreenSaver";
        driver.findElement(By.xpath("//a[@href='Default.aspx']")).click();
        String actualcustomerName=driver.findElement(By.xpath("(//table//tbody)[2]//tr[3]//td[2]")).getText();
        String actualproductName=driver.findElement(By.xpath("(//table//tbody)[2]//tr[3]//td[3]")).getText();

       Assert.assertEquals(actualcustomerName,expectedCustomerName);
       Assert.assertEquals(actualproductName,expectedProduct);


    }

}
