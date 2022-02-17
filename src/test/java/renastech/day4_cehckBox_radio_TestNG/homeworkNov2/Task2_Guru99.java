package renastech.day4_cehckBox_radio_TestNG.homeworkNov2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Task 2
//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
public class Task2_Guru99 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");

        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
       // System.out.println(driver.findElement(By.xpath("//input[@id='vfb-6-0']")).getAttribute("type"));
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input"));

        for ( WebElement eachBox : checkBoxes){

            if (eachBox.getAttribute("id").equals("vfb-6-0")||eachBox.getAttribute("id").equals("vfb-6-1")
            || eachBox.getAttribute("id").equals("vfb-6-2")){
                if (!eachBox.isSelected()){
                    System.out.println(eachBox.getAttribute("value")+" is not selected");
                }else {
                    System.out.println(eachBox.getAttribute("value")+" is  selected");
                }
            }
        }

        //4. Click to checkbox3
        driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
        //5. Verify checkbox3 is selected
       WebElement checkbox3= driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
       if (checkbox3.isSelected()){
           System.out.println("Check box 3 is checked");
       }else {
           System.out.println("Check box 3 is not checked");
       }



    }
}
