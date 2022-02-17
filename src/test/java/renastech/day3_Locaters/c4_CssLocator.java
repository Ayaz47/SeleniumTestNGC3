package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c4_CssLocator {
    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");

        driver.get("https://www.amazon.com");


//        1- tagname[attribute='value']
       // driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("tv");
        //input[dir='auto'] we create this one manually and search it in the code to see if it is unique
        // input is tag name dir is attribute and auto is value

        //        3-tagname#value # means id in css
        //input[id='twotabsearchtextbox'] you can also use this one

        driver.findElement(By.id("twotabsearchtextbox"));
        driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
        // input#twotabsearchtextbox
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tv");
        driver.close();

    }
}
