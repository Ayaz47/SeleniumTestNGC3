package renastech.day2_Locaters.homeworkday2_oct28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//tc4
//TASK: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title is Apple
public class task4_feelingluckyButtonGoogle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://google.com");

        driver.findElement(By.className("gLFyf")).sendKeys("apple");
        Thread.sleep(2000);
        WebElement feelinglucky=driver.findElement(By.name("btnI"));
        feelinglucky.click();

        String expectedTitle="Apple (Canada)";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Aplle title verified");
        }else {
            System.out.println("Aplle title could not verified");
        }

        driver.close();
    }
}
