package renastech.day7_Windows_Tabs_Properties.homeworkNov9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Task1
//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Login
//4. Click on view all products
//verify prices for each product
public class Task1_SmartBear {
    //Task1
//1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Login
    WebDriver driver;
      @BeforeMethod
    public void setup(){
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
       username.sendKeys("Tester");
       WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
       password.sendKeys("test"+ Keys.ENTER);
      }

    //4. Click on view all products
//verify prices for each product
    //expected Mymoney $100 ,familyalbum $80 , Screensaver $35

    @Test
    public void TC1_pricesVerification(){
        ArrayList<String > expectedList=new ArrayList<>(Arrays.asList("MyMoney $100","FamilyAlbum $80","ScreenSaver $20"));
        driver.findElement(By.partialLinkText("products")).click();
         //table//tbody/tr/td[@align='center'][1]
      //  (//table//tbody)[2]//tr//td[2]
        List<WebElement> priceList=driver.findElements(By.xpath("//table//tbody/tr/td[@align='center'][1]"));
        List<WebElement> productNames=driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[1]"));
        ArrayList<String> actualList=new ArrayList<>();
        for (int i=0; i<priceList.size(); i++){
            actualList.add(productNames.get(i).getText()+" "+priceList.get(i).getText());

        }



        System.out.println("concatedList = " + actualList);
        Assert.assertEquals(actualList,expectedList);
    }

}
