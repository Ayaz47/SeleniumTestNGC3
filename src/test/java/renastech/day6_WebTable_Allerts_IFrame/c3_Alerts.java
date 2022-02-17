package renastech.day6_WebTable_Allerts_IFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import renastech.utilities.WebDriverUtil;
import renastech.utilities.browserUtils;

import java.util.concurrent.TimeUnit;

public class c3_Alerts {
    //1- Open a chrome browser
    //2- Go to:http://practicerenastech.com/
    //locate the alert button to click it
    //click button
    //handle alert

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practicerenastech.com/");
    }
    @Test
    public void TC1_AlertPractice(){
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();

//locate the alert button to click it
        WebElement alertButton=driver.findElement(By.id("confirm-demo"));

        //click button
        alertButton.click();
        //handle alert
        //since alert is JS alert you need to change your driver's focus to alert

        Alert alert=driver.switchTo().alert();
        browserUtils.wait(2);
        alert.accept();//clicking OK button

        browserUtils.wait(2);
        alertButton.click();
        alert.dismiss();
        //you can also send text and handle with accept or dismiss

    }
}
