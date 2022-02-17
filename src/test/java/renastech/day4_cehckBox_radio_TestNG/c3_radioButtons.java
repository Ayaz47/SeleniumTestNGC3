package renastech.day4_cehckBox_radio_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_radioButtons {
    public static void main(String[] args) {
       /*
Navigate to https://courses.letskodeit.com/practice
click on BMW RADIO button
verify that its selected
Check Bmw, Benz, honda
validate that benz i

     */


        WebDriver driver= WebDriverUtil.getDriver("chrome");

        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement bmwRadioButton=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        bmwRadioButton.click();

        boolean bmwRadioSelected=bmwRadioButton.isSelected();

        if (bmwRadioSelected){
            System.out.println("Bmw is selected");
        }else {
            System.out.println("Bmw is not selected test failed!!!");
        }

        WebElement hondaRadioButton=driver.findElement(By.xpath("//input[@id='hondaradio']"));
       // bmwRadioButton.click();

        if (!hondaRadioButton.isSelected()){
            System.out.println("Honda is not selected test passed");
        }else {
            System.out.println("Honda is selected test failed");
        }

      //  driver.close();


    }
}
