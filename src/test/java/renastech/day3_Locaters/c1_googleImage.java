package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c1_googleImage {
    public static void main(String[] args) {
        //Task:Google Image link
        //1- Open a chrome browser and go to google
        //2- Click to Image link from top right
        //3- Verify Title contains Image

        //1- Open a chrome browser and go to google
        WebDriver driver=WebDriverUtil.getDriver("chrome");

        driver.get("https://www.google.com");


        //2- Click to Image link from top right
        driver.findElement(By.linkText("Images")).click();
        //driver.findElement(By.partialLinkText("Ima")).click();

        //this webelement has also class name but it is not unique gmail button also has same class name
        //gmail button is first matching one

        //3- Verify Title contains Image
        String actualTitle=driver.getTitle();
        String containsTitle="Image";

        if (actualTitle.contains(containsTitle)){
            System.out.println("Title passed");
        }else {
            System.out.println("Failed");
            System.out.println("actualTitle = " + actualTitle);
        }
    }

}
