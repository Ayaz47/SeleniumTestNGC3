package renastech.day8_properties_JSexecu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.PropertiesReadingUtil;
import renastech.utilities.SmartBearUtils;

import java.util.List;

//open chrome browser
//go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//click on box which belongs "charles Dodgeson"
//click on delete button
//verify if charles deleted from the list
public class c1_SmartBearPractice extends TestBase {
    @Test
    public void TC1_CharlesDeleteVerification(){
        //open chrome browser
//go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(driver);
//click on box which belongs "charles Dodgeson"
       WebElement charlesCheckBox= driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
       charlesCheckBox.click();

//click on delete button
        WebElement deleteButton= driver.findElement(By.className("btnDeleteSelected"));
        deleteButton.click();
//verify if charles deleted from the list
        //after deletion of charles we will need to check all table and make sure charles is not in table anymore
        //first  store all names
        List<WebElement> listofNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr//td[2]"));

        // verify chares is not there
        for (WebElement eachName: listofNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"), "Charles is present in the table and verification failed!");
        }

    }
}
