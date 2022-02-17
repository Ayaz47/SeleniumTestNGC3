package renastech.day2_Locaters.homeworkday2_oct28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC #6: Facebook header verification
//1. Open Chrome browser
//2. Go to https://www.facebook.com
//3. click Create a Page link
//4. verify new page has header called Create a Page (hint get text method)
public class task6_FacebookHeaderVerify {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Create a Page")).click();

        Thread.sleep(2000);

       String actualheader= driver.findElement(By.className("_203y")).getText();
       String expectedheader="Create a Page";

       if (actualheader.equals(expectedheader)){
           System.out.println("Header verified");

       }else {
           System.out.println("Header couldnt verified");
           System.out.println("actualheader = " + actualheader);
       }
       driver.close();
    }
}
