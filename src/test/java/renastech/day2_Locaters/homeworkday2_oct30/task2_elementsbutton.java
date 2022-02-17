package renastech.day2_Locaters.homeworkday2_oct30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//task 2:
//        1. Open Chrome browser
//        2. Go to http://practicerenastech.com/
//        3. Click on Elements button
//        3. Locate all the elements 1,2,3,4 part by using xpath locater
public class task2_elementsbutton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();

        driver1.get("http://practicerenastech.com");

        driver1.findElement(By.id("selenium-Elements")).click();



        WebElement seleniumheader1=driver1.findElement(By.xpath("//h1[.='Elements part I']"));
        WebElement seleniumheader2=driver1.findElement(By.xpath("//h1[.='Elements part II']"));
        WebElement seleniumheader3=driver1.findElement(By.xpath("//h1[.='Elements part III']"));
        WebElement seleniumheader4=driver1.findElement(By.xpath("//h1[.='Elements part IV']"));
        List<WebElement>seleniumelements=new ArrayList<>(Arrays.asList(seleniumheader1,seleniumheader2,seleniumheader3,seleniumheader4));

        for (WebElement eachelent: seleniumelements) {
            if (eachelent.isDisplayed()){
                System.out.println(eachelent+" is present");
            }else {
                System.out.println(eachelent+" is not present");
            }
        }

    }
    }

