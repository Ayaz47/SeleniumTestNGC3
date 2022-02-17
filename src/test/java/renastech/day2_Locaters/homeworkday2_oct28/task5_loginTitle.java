package renastech.day2_Locaters.homeworkday2_oct28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

//TASK5: Facebook incorrect login title verification
//1. Open Chrome browser
//2. Go to https://www.facebook.com
//3. Enter incorrect username
//4. Enter incorrect password
//5. Verify title changed to:
//Expected: "Log into Facebook"
public class task5_loginTitle {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.facebook.com");

        String incorrectusername="sdfkjslgkdfmxv";
        driver.findElement(By.id("email")).sendKeys(incorrectusername);

        String incorrectpass="12325jfdji";
        driver.findElement(By.id("pass")).sendKeys(incorrectpass+ Keys.ENTER);

        Thread.sleep(2000);
        String expectedTitle="Log into Facebook";
        String actualTitle=driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title couldnt verified");
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();


    }
}
