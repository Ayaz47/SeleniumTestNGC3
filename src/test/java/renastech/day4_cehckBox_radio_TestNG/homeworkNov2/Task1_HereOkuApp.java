package renastech.day4_cehckBox_radio_TestNG.homeworkNov2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Task 1
//        1)Navigate to http://the-internet.herokuapp.com/
//        2)Validate  page title
//        3)Validate  page url
//        4)Click Checkboxes
//        5)Change Checkbox 1 to “Checked”
//        6)Validate that its “checked”
//        7)Change Checkbox 2 to “Unchecked”
//        8)Validate that Checkbox 2 is “Unchecked”
public class Task1_HereOkuApp {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
       // 1)Navigate to http://the-internet.herokuapp.com/
        driver.get("http://the-internet.herokuapp.com/");

        //        2)Validate  page title
        String expectedTitle="The Internet";
        String actualTitle=driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title could not verified");
            System.out.println("actualTitle = " + actualTitle);
        }

        //        3)Validate  page url
        String expectedURL="http://the-internet.herokuapp.com/";
        String actualURL= driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("The current URL verified");
        }else {
            System.out.println("The current URL could not verified");
        }

        //        4)Click Checkboxes
        driver.findElement(By.linkText("Checkboxes")).click();

        //        5)Change Checkbox 1 to “Checked”
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();


        //        6)Validate that its “checked”
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        if (checkbox1.isSelected()){
            System.out.println("Check box 1 is checked and validated.");
        }else {
            System.out.println("Check box 1 is not checked and validated.");
            System.out.println("Please check locator!");
        }

        //        7)Change Checkbox 2 to “Unchecked”
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();

        //        8)Validate that Checkbox 2 is “Unchecked”
        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (!checkbox2.isSelected()){
            System.out.println("Check box 2 is unchecked and validated.");
        }else {
            System.out.println("Check box 2 is not unchecked and validated.");
            System.out.println("Please check locator!");
        }

        driver.close();
    }
}
