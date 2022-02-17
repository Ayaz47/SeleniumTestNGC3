package renastech.day6_WebTable_Allerts_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//Task5
//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- enter incorrect username
//4- enter wrong password
//5- click login button
//6- verify error message displayed :Invalid Login or Password.
//Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
//this method should cover step3,4,5
public class c5_smartBearNegativeTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


    }
    @Test(dataProvider = "testData")
    public void TC1_NegativeTest(String userName, String passowrd){
        //3- enter incorrect username
//4- enter wrong password
//5- click login button
        SmartBearUtils.negatieLoginForSmartBear(driver,userName,passowrd);
//6- verify error message displayed :Invalid Login or Password.
        WebElement errormessage=driver.findElement(By.id("ctl00_MainContent_status"));

        Assert.assertTrue(errormessage.isDisplayed());

    }
    @DataProvider(name="testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{
                {"esther","esther123"},
                {"ozge","ozge567"},
                {"","435345"},
                {"mesut","easy"},
                {"sdas&&& %$","234 ^&"},
                {"Tester","test"}};
    }
}
