package renastech.day5_TestNG_Dropdown.homeworkday05_Nov5_8;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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

public class Task4_Smartsbear {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Task 4 is running to test Smartsbearsoftware");
    }
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test(priority = 1)
    public void TC1_createNewOrder() throws InterruptedException {

//3- Login
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test"+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//4. Click on Order
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
        //5. Select familyAlbum from product, set quantity to 5
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));

        Select dropdownbox=new Select(dropdown);

        dropdownbox.selectByValue("FamilyAlbum");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("5");

        //6. Click to "Calculate" button
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        //7. Fill address Info with JavaFaker

        Faker faker=new Faker();

        String name=faker.name().fullName();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);

        String street=faker.address().streetAddress();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(street);

        String city=faker.address().city();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);

        String state=faker.address().state();
                driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);

        String zipcode=faker.address().zipCode();
        zipcode=zipcode.replace("-","");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zipcode);


        ////8. Click on "visa" radio button
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();


        String cardnumber=faker.finance().creditCard();
        String cardnumber1=cardnumber.replace("-","");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardnumber1);
        ////10Enter expiration date
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("03/23");
        ////11. Click on "Process"
        driver.findElement(By.linkText("Process")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//strong")).isDisplayed(),"New order message is not displayed");



    }



}
