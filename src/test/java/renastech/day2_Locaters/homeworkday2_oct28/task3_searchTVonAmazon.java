package renastech.day2_Locaters.homeworkday2_oct28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

//task3
//1.open Chrome browser
//2.Go to https://www.amazon.com
//3.type TV on search box
//4.then click on search button
//5.verify title
public class task3_searchTVonAmazon {


    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TV"+ Keys.ENTER);

        String expectedTitle="TV";
        String actualTitle=driver.getTitle();

        if (actualTitle.endsWith(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title could not verified");
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
