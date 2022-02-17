package renastech.day6_WebTable_Allerts_IFrame;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//Task4
//1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Login
//4. Click on Order
//5. Select familyAlbum from product, set quantity to 5
//6. Click to "Calculate" button
//7. Fill address Info with JavaFaker
//8. Click on "visa" radio button
//9. Generate card number using JavaFaker
//10Enter expiration date
//11. Click on "Process"
//12.Verify success message "New order has been successfully added." is displayed.
public class c1_SmartBearTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.loginForSmartBear(driver);
        //in inspect use --// in search to locate an element before it finds irrelevant things then delete --
    }

    @Test
    public void TC1(){
//4. Click on Order
        ////a[.='Order']
        ////a[@href='Process.aspx']
        //linktext
        WebElement orderlink=driver.findElement(By.xpath("//a[.='Order']"));

        orderlink.click();

        Select dropdownProduct=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));

        dropdownProduct.selectByVisibleText("FamilyAlbum");

        WebElement quantity=driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        //quantity.clear();
        quantity.sendKeys("5");
      //  quantity.clear();

        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        //7. Fill address Info with JavaFaker
        Faker faker=new Faker();
        WebElement customerName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        customerName.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetAddress());
        cityName.sendKeys(faker.address().cityName());
        stateName.sendKeys(faker.address().state());
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));

       WebElement visaButton= driver.findElement(By.xpath("//input[@value='Visa']"));
       visaButton.click();

       WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
       cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        //10Enter expiration date

        WebElement expirationDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationDate.sendKeys("05/27");


        WebElement processButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        WebElement successMessage=driver.findElement(By.xpath("//strong"));

        Assert.assertEquals(successMessage.getText(),"New order has been successfully added.");
    }
}
