package renastech.day2_Locaters.homeworkday2_oct28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "orange" in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.
public class task1_googleSearch {

    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");


        //3- Write "orange" in search box
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(3000);
        //4- Click google search button
       WebElement googlesearchButton= driver.findElement(By.className("gNO89b"));
        googlesearchButton.click();

        //5- Verify title:
//Expected: Title should start with "apple" word

        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){

            System.out.println("apple Title passed");
        }else{
            System.out.println("apple Title failed");
            System.out.println("actualTitle = " + actualTitle);
        }

        Thread.sleep(1000);
        //6-navigate back
        driver.navigate().back();

        //7-write cherry in search box
        driver.findElement(By.name("q")).sendKeys("cherry"+Keys.ENTER);

        //8-verify title contains cherry.
        String expectedTitle2="cherry";
        String actualTitle2=driver.getTitle();

        if (actualTitle2.startsWith(expectedTitle2)){

            System.out.println("cherry Title passed");
        }else{
            System.out.println("cherry Title failed");
            System.out.println("actualTitle2 = " + actualTitle2);
        }

        Thread.sleep(2000);
        driver.close();
    }

}
