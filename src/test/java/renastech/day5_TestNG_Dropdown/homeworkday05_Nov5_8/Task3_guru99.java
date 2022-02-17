package renastech.day5_TestNG_Dropdown.homeworkday05_Nov5_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//Task3
//        go to website http://demo.guru99.com/test/newtours/register.php
//        fill contact information --- dont use faker here
//        fill out mailing info
//        fill user information -- dont use faker here
//        click on submit button
//        verify your username and name displayed in the register page
//        Example :  Dear hello dasdad, Note: Your user name is asdasda.
public class Task3_guru99 {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void TC1_registration(){
        //        fill contact information --- dont use faker here
        driver.findElement(By.name("firstName")).sendKeys("veronica");
        driver.findElement(By.name("lastName")).sendKeys("albatros");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("4167654343");
        driver.findElement(By.id("userName")).sendKeys("abc@hotmail.com");

//        fill out mailing info
        driver.findElement(By.name("address1")).sendKeys("12 avro rd");
        driver.findElement(By.name("city")).sendKeys("georgina");
        driver.findElement(By.name("state")).sendKeys("ontario");
        driver.findElement(By.name("postalCode")).sendKeys("L5A3R2");

       WebElement countryDropdown= driver.findElement(By.name("country"));
       Select countryList=new Select(countryDropdown);
       countryList.selectByVisibleText("CANADA");
//        fill user information -- dont use faker here
        driver.findElement(By.id("email")).sendKeys("abc@hotmail.com");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
//        click on submit button
        driver.findElement(By.name("submit")).click();
//        verify your username and name displayed in the register page
//        Example :  Dear hello dasdad, Note: Your user name is asdasda.
        Assert.assertTrue(driver.findElement(By.xpath("//p//b[1]")).isDisplayed(),"Expected message is not there");

    }
}
