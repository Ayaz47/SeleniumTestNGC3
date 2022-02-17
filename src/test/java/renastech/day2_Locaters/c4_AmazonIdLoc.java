package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_AmazonIdLoc {
    public static void main(String[] args) {
        //1.open Chrome browser
        //2.Go to https://www.amazon.com
        //3.type laptop on search box
        //4.then click on search button
        //5.verify title


        //        //1.open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();//optional
        //2.Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        String searchData="phone";

        //3.type laptop on search box
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchData);
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);

        //4.then click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        //5.verify title

        String containsTitle=searchData;
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(containsTitle)){
            System.out.println("Amazon search passed");
        }else {
            System.out.println("Amazon search failed");
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
