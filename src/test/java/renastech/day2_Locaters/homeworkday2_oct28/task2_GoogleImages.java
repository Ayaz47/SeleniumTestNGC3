package renastech.day2_Locaters.homeworkday2_oct28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//task2
//  //1- Open a chrome browser and go to google
//        //2- Click to Images link from top right
//        //3- Verify Title contains Images, expected: "Images"
public class task2_GoogleImages {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Images")).click();

        Thread.sleep(2000);

        String containsTitle="Images";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(containsTitle)){
            System.out.println("The page title contains Images");
        }else {
            System.out.println("The page title does not contain Images");
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
