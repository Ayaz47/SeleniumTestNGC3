package renastech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        //Go to google
        driver.get("https://www.google.ca");//this line takes us to google
        Thread.sleep(2000);
        //Navigate back
        driver.navigate().back();//this line will take us back to empty page
        Thread.sleep(2000);
        //Navigate forward
        driver.navigate().forward();//this line will take us forward to google

        Thread.sleep(2000);
        //Navigate to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //Verify title contains : Smile
       String actualTitle= driver.getTitle();

       String expectedTitle="Smile";
       if (actualTitle.contains(expectedTitle)){
           System.out.println("Amazon Title contains "+expectedTitle);
       }else {
           System.out.println("Amazon Title does not contain "+expectedTitle);
           System.out.println(actualTitle);
       }
       driver.close();
    }
}
