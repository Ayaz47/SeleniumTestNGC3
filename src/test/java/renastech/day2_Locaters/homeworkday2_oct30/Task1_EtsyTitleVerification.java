package renastech.day2_Locaters.homeworkday2_oct30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

//Task 1: Etsy Title Verification
//        1. Open Chrome browser
//        2. Go to https://www.etsy.com
//        3. Search for "laptop"
//        4. Verify title:
//        Expected: "laptop | Etsy"
public class Task1_EtsyTitleVerification {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://www.etsy.com");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("laptop" + Keys.ENTER);
        Thread.sleep(2000);
        //        4. Verify title:
//        Expected: "laptop | Etsy"
        String expectedtitle = "Laptop | Etsy CA";
        String actualTitle=driver.getTitle();

        if (expectedtitle.equals(actualTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title couldnt verified");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();
    }
}
