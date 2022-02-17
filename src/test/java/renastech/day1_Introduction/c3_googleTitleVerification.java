package renastech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_googleTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //        Task
//1.Open Chrome Browser
//2.Go to google
//3.Verify title : Expected : Google
        //sewgins answer
        //1.open chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //go to the google
        driver.get("https://www.google.ca");
        Thread.sleep(2000);

        //3.Verify title : Expected : Google

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google Title Verification has passed !");
        }else {
            System.out.println("Google Title Verification has failed !");
            System.out.println("Browser Title is :"+actualTitle);
        }

        driver.close();

    }
}
