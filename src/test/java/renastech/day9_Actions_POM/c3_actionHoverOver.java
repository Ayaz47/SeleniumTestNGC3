package renastech.day9_Actions_POM;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c3_actionHoverOver extends TestBase2 {
    @Test
    public void TC1_HoverOver(){
        //go to http://the-internet.herokuapp.com/hovers
        //move mouse to third image
        //verify text of image present on the screen

        //"http://the-internet.herokuapp.com/hovers"
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");
        //h5[.='name: user3']/../../img
        //h5[.='name: user3']/../preceding-sibling::img

        // /preceding-sibling will go previous sibling
        // / following-sibling will go next sibling
        WebElement thirdImage=DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));
        Actions actions=new Actions(DriverUtil.getDriver());
        actions.moveToElement(thirdImage).perform();

        WebElement imageText=DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        boolean testIsPresent=imageText.isDisplayed();
        Assert.assertTrue(testIsPresent,"text is not present");
    }
}
