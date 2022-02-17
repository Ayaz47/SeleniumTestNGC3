package renastech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkDay1 {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String expectedTitle="Facebook - Log In or Sign Up";
       String actualTitle= driver.getTitle();

       if (expectedTitle.equals(actualTitle)){
           System.out.println("Facebook Title verification has passed the test!");
       }else{
           System.out.println("Facebook Title verification hasn't passed the test!");
           System.out.println(actualTitle);
       }
       driver.close();


//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.google.ca");
        Thread.sleep(3000);
        driver1.navigate().back();
        Thread.sleep(4000);
        driver1.navigate().forward();
        Thread.sleep(2000);
        driver1.navigate().to("https://www.amazon.com");
        String actualTitle2=driver.getTitle();
        String expectedTitle2="Smile";
        driver1.close();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Amazon Title Contains "+expectedTitle2);
        }else {
            System.out.println("Amazon Title Does not Contain "+expectedTitle2);
            System.out.println("The actual Title is "+actualTitle2);
        }

    }
}
