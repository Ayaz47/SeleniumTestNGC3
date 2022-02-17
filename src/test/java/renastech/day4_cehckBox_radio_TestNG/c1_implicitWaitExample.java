package renastech.day4_cehckBox_radio_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_implicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.vinexponewyork.com");

        //we are giving drriver a option to wait until page loadded
        //as soon as your weblement loadded it will move on next step
        //it is not going to wait until 10 sn
        //if this was thread.sleep no matter it will always wait for 10 sn

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Thread.sleep(5000);
        WebElement attendButton=driver.findElement(By.cssSelector("a[href='/attend/']"));
        attendButton.click();


    }
}
