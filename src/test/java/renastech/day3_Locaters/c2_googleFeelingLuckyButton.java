package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c2_googleFeelingLuckyButton {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google Feeling lucky button
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "apple" in search box
        //click i am feeling lucky button
        //Verify title contains Apple

        //1- Open a chrome browser
       WebDriver driver=WebDriverUtil.getDriver("chrome");

        //2- Go to: https://google.com
       driver.get("https://www.google.com");

       //driver.findElement(By.name("q")).sendKeys("Apple");
      // driver.findElement(By.className("gLFyf gsfi")).sendKeys("Apple");
        //having spaces in class name will make your code fail .
        //you can rremove one part to see if it is unique  you can locate

        //3- Write "apple" in search box
        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
        Thread.sleep(2000);

        //click i am feeling lucky button
        driver.findElement(By.className("RNmpXc")).click();


        //Verify title contains Apple
        String actualTitle=driver.getTitle();
        String expectedtitle="Apple";

        if (actualTitle.contains(expectedtitle)){
            System.out.println("Lucky button passed");
        }else {
            System.out.println("Luck button failed");
            System.out.println("actualTitle = " + actualTitle);
        }
    }
}
