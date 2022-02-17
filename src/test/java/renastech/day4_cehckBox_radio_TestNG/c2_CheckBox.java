package renastech.day4_cehckBox_radio_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_CheckBox {

//1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify checkbox1 is not selected
    //4. Click to checkbox2
    //5. Verify checkbox2 is selected



    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // driver.findElement(By.id("vfb-6-0"));//best option we have
        //driver.findElement(By.xpath("//input[@value='checkbox1']"));
        WebElement checkbox1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
        if (!checkbox1.isSelected()){
            System.out.println("Default verification for checkbox1 passed");
        }else {
            System.out.println("Default verification for checkbox1 failed!!");
        }

        WebElement checkbox2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        checkbox2.click();

        if (checkbox2.isSelected()){
            System.out.println(" verification for checkbox2 after click passed");
        }else{
            System.out.println(" verification for checkbox2 after click failed");
        }
        Thread.sleep(3000);

        driver.close();
    }
}
