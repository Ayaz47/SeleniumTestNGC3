package renastech.day7_Windows_Tabs_Properties.homeworkNov9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

//Task3
// Alert Message handling
// go to "http://demo.guru99.com/test/delete_customer.php"
// delete customer 53920
// Switch to Alert
// Capture alert message.
// Display alert message
// Accepting alert
public class Task3_guru99Alert {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        // go to "http://demo.guru99.com/test/delete_customer.php"
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void TC1_alertMessage(){
        // delete customer 53920
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920"+ Keys.ENTER);
        // Switch to Alert
       Alert customerDeletion= driver.switchTo().alert();
        // Capture alert message
        // Display alert message
        System.out.println("customerDeletion.getText() = " + customerDeletion.getText());
        // Accepting alert
        customerDeletion.accept();
        //recapture deletion confirmation and accept the second message
        Assert.assertEquals(customerDeletion.getText(),"Customer Successfully Delete!");
        customerDeletion.accept();
    }
}
