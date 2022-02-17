package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_GmailLinkPartialLoc {

    public static void main(String[] args) {
        //  //1- Open a chrome browser and go to google
        //        //2- Click to Gmail link from top right
        //        //3- Verify Title contains Gmail, expected: "Gmail"

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //        //2- Click to Gmail link from top right
        driver.findElement(By.linkText("Gmail")).click();
      //  driver.findElement(By.partialLinkText("Gma")).click();

//3- Verify Title contains Gmail, expected: "Gmail"
        String containsTitle="Gmail";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(containsTitle)){
            System.out.println("Gmail Passed");
        }else {
            System.out.println("Gmail Failed");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();
    }
}
