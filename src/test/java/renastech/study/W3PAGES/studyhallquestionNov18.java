package renastech.study.W3PAGES;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class studyhallquestionNov18 extends TestBase2 {
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab
//Click on the "menu" button
    @Ignore
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        WebElement tryButton=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        //button[@onclick='myFunction()']
        tryButton.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("ridvan oral");
        alert.accept();
        WebElement expected=driver.findElement(By.xpath("//p[@id='demo']"));
        Assert.assertTrue(expected.getText().contains("ridvan oral"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("tryhome")).click();
        Set<String> windows=driver.getWindowHandles();
        ArrayList<String> newtab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newtab.get(1));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("w3loginbtn")).click();

        driver.findElement(By.id("modalusername")).sendKeys("hasan");
        driver.findElement(By.id("current-password")).sendKeys("11111111111111");
        driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V']")).click();

    }
    //versus using POM


    @Test(priority = 0)
    public void TC1_tryItbutton(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("w3tryitURL"));
        TryItPage obj=new TryItPage();
        DriverUtil.getDriver().switchTo().frame(obj.tryitFrame);
        obj.tryItMethod();//click on tryit button

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("ridvan oral");
        alert.accept();
        Assert.assertTrue(obj.getMessageAfterTry().contains("ridvan oral"));
    }
    @Test(priority = 1,dependsOnMethods = "TC1_tryItbutton")
    public void TC2_navigatingHomePage(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("w3tryitURL"));
        TryItPage obj=new TryItPage();
        obj.clickHomeButton();
        Set<String> listofWindows=DriverUtil.getDriver().getWindowHandles();
        for (String each:listofWindows){
            DriverUtil.getDriver().switchTo().window(each);
        }
        HomePage obj2=new HomePage();
        obj2.clickloginButton();

    }
    @Test(priority = 2, dependsOnMethods = "TC2_navigatingHomePage")
    public void TC3_loginForW3(){
        LoginPage obj=new LoginPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("w3LoginURL"));
        obj.logintoThePage("ridvan","12345667");
    }



}


