package renastech.day6_WebTable_Allerts_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_WebTable {
    //    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  "9, Maple Valley"
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.loginForSmartBear(driver);
    }

    @Test

    public void TC1_verifyMarkStreetName(){
//       2. Click on View all orders
        driver.findElement(By.linkText("View all orders")).click();
        //       3. Verify Mark Smith has street as  "9, Maple Valley"
        //td[.='9, Maple Valley']
        //td[.='770077007700']//..//td[6]                  >>> this is really good way to do
        //td[.='Mark Smith']/following-sibling::td[4]
        //td[.='9, Maple Valley' and @.-'Mark Smith' and @.='FamilyAlbum']

        WebElement markstreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
        System.out.println("markstreet.getText() = " + markstreet.getText());

        String actualStreet=markstreet.getText();
        String expectedStreet="9, Maple Valley";

        Assert.assertEquals(actualStreet,expectedStreet,"Street name failed");




    }
}
