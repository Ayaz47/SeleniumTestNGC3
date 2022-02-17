package renastech.day5_TestNG_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_GoogleTestNG {
    //1- Go to google
//2- Verify title is google

//1- Go to google
//search laptop
//make sure title contains laptop

    //common steps
    //setup driver and go to google

    WebDriver driver;//null driver

    @BeforeMethod
    public void setup(){
        //this annoation will apply all of your tests
        //so its better to use common steps in here so you dont duplicate steps
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }
    @Test(priority = 1)
    public void TC1_googleVerifyTitle()  {
        System.out.println("TC1 is running");
        //1- Go to google //this is done in the before method
//2- Verify title is google
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle,"Title Verification Failed !!!");
        //message will only be shown in case of failed
    }
    @Test(priority = 2)
    public void TC2_googleSearchBox(){
        //1- Go to google it is done in beforemethod
        System.out.println("TC2 is running");
        //search laptop
        WebElement searchbox=driver.findElement(By.name("q"));
        searchbox.sendKeys("laptop", Keys.ENTER);
        //make sure title contains laptop
        String actualTitle=driver.getTitle();
        String containsTitle="laptop";

        boolean b=actualTitle.contains(containsTitle);
        Assert.assertTrue(b,"search function failed!");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
