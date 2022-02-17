package renastech.day8_properties_JSexecu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.browserUtils;

/*
 Go to "http://the-internet.herokuapp.com/"
 click JavaScript Alerts
 Click for Js Prompt
 Enter "hello word" text
 Click okay
 Validate your text appearing on the page
 */
public class c4_AlertPractice extends TestBase2 {
    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        WebElement jsAllertButton= DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAllertButton.click();
        //button[.='Click for JS Prompt']

        WebElement clickForpromptButton=DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickForpromptButton.click();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        String word="Hello World";
        alert.sendKeys(word);
        browserUtils.wait(5);
        alert.accept();

        WebElement actualText=DriverUtil.getDriver().findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(actualText.getText().contains(word));
    }
}
