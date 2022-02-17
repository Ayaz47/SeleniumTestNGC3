package renastech.day8_properties_JSexecu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import sun.java2d.pipe.DrawImage;

public class c3_DriverUtilPractice extends TestBase2 {
    //go to google
    //search for hello
    //verify title contains hello
    @Test
    public void TC1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));//after we had driver util this is the way to call driver
        // we dont need to set it up in test base class becuase singletion design of driver will give us driver each time we call get driver method
        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem=PropertiesReadingUtil.getProperties("google_searchData");//its good for storing environment names and titles in prop

        searchBox.sendKeys(searchItem+ Keys.ENTER);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));
    }
}
