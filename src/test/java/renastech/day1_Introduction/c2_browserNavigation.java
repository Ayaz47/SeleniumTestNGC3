package renastech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        //create the connection between chrome and selenium
        WebDriverManager.chromedriver().setup();

        //create an instance of chrome driver
        WebDriver chromedriver=new ChromeDriver();

        //miximize the page

        chromedriver.manage().window().maximize();

        chromedriver.get("https://www.amazon.ca");
        Thread.sleep(2000);
        chromedriver.navigate().back();
        Thread.sleep(2000);
        chromedriver.navigate().forward();

        System.out.println("chromedriver.getTitle() = " + chromedriver.getTitle());

        chromedriver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        System.out.println("chromedriver.getTitle() = " + chromedriver.getTitle());



        //        Task
//1.Open Chrome Browser
//2.Go to google
//3.Verify title : Expected : Google

        chromedriver.get("https://www.google.ca");
        String title=chromedriver.getTitle();
        if (title.endsWith("Google")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }
        chromedriver.close();

    }
}
