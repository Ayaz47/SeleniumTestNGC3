package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

import java.security.Key;

public class c3_FacebookNegativeLogin {
    //    //TASK: Facebook incorrect login title verification
    //        //1. Open Chrome browser
    //        //2. Go to https://www.facebook.com
    //        //3. Enter incorrect username
    //        //4. Enter incorrect password
    //        //5. Verify title changed to:
    //        //Expected: "Log into Facebook"

    public static void main(String[] args) throws InterruptedException {
        //        //1. Open Chrome browser
        WebDriver driver= WebDriverUtil.getDriver("chrome");

        //        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //        //3. Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("asdasdasdada");

        //        //4. Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("ssdkjsfknmxcmn", Keys.ENTER);
        Thread.sleep(10000);

        //        //5. Verify title changed to:
        //        //Expected: "Log into Facebook"
        String actualTitle=driver.getTitle();
        String expectedtitle="Log into Facebook";

        if (actualTitle.equals(expectedtitle)){
            System.out.println("Facebook negative test passed");
        }else {
            System.out.println("Facebook negative test failed");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();




    }
}
