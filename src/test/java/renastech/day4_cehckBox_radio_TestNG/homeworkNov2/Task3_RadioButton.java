package renastech.day4_cehckBox_radio_TestNG.homeworkNov2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

//Task 3
//2. Go to https://demo.guru99.com/test/radio.html
//4. Click to radiobutton2
//5. Verify radiobutton2 is selected
public class Task3_RadioButton {
    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
        //4. Click to radiobutton2

        driver.findElement(By.id("vfb-7-2")).click();
        //5. Verify radiobutton2 is selected

        WebElement radiobutton2 = driver.findElement(By.id("vfb-7-2"));
        if (radiobutton2.isSelected()){
            System.out.println("radiobutton2 is selected");
        }else {
            System.out.println("radiobutton2 is not selected");
        }

    }

}

