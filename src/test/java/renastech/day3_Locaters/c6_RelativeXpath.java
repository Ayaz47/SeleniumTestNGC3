package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class c6_RelativeXpath {
    public static void main(String[] args) {
        // 1-//tagname[@attribute='value']-- looks for tagname attribute and value
        // 2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
        // 3-//tagname[.='text'] --looks for exact text match for any attribute


        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://practicerenastech.com/");
        driver.manage().window().maximize();

        //1-//tagname[@attribute='value']-- looks for tagname attribute and value
        driver.findElement(By.xpath("//mat-card[@id='selenium-Elements']")).click();


        // 2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
        driver.findElement(By.xpath("//mat-card[contains(@id,'Elements')]")).click();

        //3-//tagname[.='text'] --looks for exact text match for any attribute
      WebElement seleniumHeader1= driver.findElement(By.xpath("//h1[.='Elements part I']"));

      if (seleniumHeader1.isDisplayed()){
          //isDisplayed will check if the elemnt is present on the page
          System.out.println("Header is present");
      }else {
          System.out.println("Header is not present");
          System.out.println("seleniumHeader1 = " + seleniumHeader1);
      }
    }
}

//Locater approaches
//first option will be id because it is unique (but we will also need to make sure if it is static)
//second option can be name class name linktext if it is unique (usually name and classnames are not unique)
//then i prefer xpath

//    Differences Css and Xpath
//-- Xpath has custom methods but css doesnt have those
//-- Xpath has abilty to go from child to parrent and parent to child
//-- but in css you can only go from parent to child
//-- css it works little faster then Xpath
//
