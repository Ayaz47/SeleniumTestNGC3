package renastech.day8_properties_JSexecu;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import renastech.base.TestBase;

import java.util.Set;

public class c2_JSExamples extends TestBase {
    @Test
    public void TC1_handlingWindowWithJSExecuter(){
        driver.get("https://www.youtube.com");
        // 1- We create javascriptExecutor object and we cast our WebDriver type instance into JavascriptExecutor type.

      ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");
      ((JavascriptExecutor) driver).executeScript("window.open('https://www.youtube.com','_blank');");

// 2- Then we have access to the methods that are coming from JavascriptExecutor interface.
        //js.executeScript(Script,Arguments);

      Set<String> windows=driver.getWindowHandles();

      for (String window:windows){
          driver.switchTo().window(window);
          String currentWindow=driver.getWindowHandle();
          System.out.println("currentWindow = " + currentWindow);
          System.out.println("driver.getTitle() = " + driver.getTitle());
      }
    }
    @Test
    public void scroolDownWithJSExecuter(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");

        js.executeScript("window.scrollBy(-10,-1000)");
          /*
        The syntax of ScrollBy() methods is :

        executeScript("window.scrollBy(x-pixels,y-pixels)");
        x-pixels is the number at x-axis,
        it moves to the left if number is positive and
        it move to the right if number is negative .
        y-pixels is the number at y-axis,
        it moves to the down if number is positive and
        it move to the up if number is in negative .
         */
    }
}
