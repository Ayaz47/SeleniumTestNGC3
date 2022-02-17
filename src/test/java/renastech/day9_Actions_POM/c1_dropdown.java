package renastech.day9_Actions_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c1_dropdown extends TestBase2 {
    @Test
    public void TC1_test(){//this is one of the most complex html dropdown menu
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");
        WebElement dropDownBox=DriverUtil.getDriver().findElement(By.id("countryDropdown"));
        dropDownBox.sendKeys("Cuba");
        dropDownBox.sendKeys(Keys.ARROW_DOWN);//since it wasnt present in the code we found it in this way
        dropDownBox.sendKeys(Keys.ENTER);
    }

}
