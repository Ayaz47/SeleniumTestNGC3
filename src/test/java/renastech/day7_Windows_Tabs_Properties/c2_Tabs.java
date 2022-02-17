package renastech.day7_Windows_Tabs_Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.browserUtils;

import java.util.Set;

public class c2_Tabs extends TestBase {
   //inheritence example to extend my test base class to all of my tests
    //

    @Test
    public void TC1_tabHandle(){
        driver.get("https://practicerenastech.com/");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow=driver.getWindowHandle();//this will only store one window
        //adn iw will store current window

        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement openTabButton=driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println("after clicking tab button driver.getTitle() = " + driver.getTitle());
        //since we didnt change driver focus it will give us same one at the beginning

        Set<String> alltabs=driver.getWindowHandles();//this will store all the tabs

        for (String tab : alltabs){
            driver.switchTo().window(tab);
            browserUtils.wait(2);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }

}
