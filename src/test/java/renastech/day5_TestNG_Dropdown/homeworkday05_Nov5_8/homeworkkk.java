package renastech.day5_TestNG_Dropdown.homeworkday05_Nov5_8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class homeworkkk {
    WebDriver driver;
    @BeforeMethod
            public void BeforeMethod(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
    }
        @Test
        public void ProductInformationStage() throws InterruptedException {
        WebElement dropBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));

            Select Dropdown = new Select(dropBox);
            Dropdown.selectByVisibleText("FamilyAlbum");
            Thread.sleep(3000);
            Dropdown.selectByIndex(2);
            Thread.sleep(3000);
            Dropdown.selectByValue("MyMoney");
            Thread.sleep(3000);






        }




}
