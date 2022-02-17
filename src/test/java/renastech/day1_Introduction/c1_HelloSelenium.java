package renastech.day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        //create connection between selenium and browser
        //setup browser
        WebDriverManager.chromedriver().setup();

        //create an instance of chrome driver to be able to test with chrome
        WebDriver driver=new ChromeDriver();//this is also polymorphism
        //we created a driver which is a chrome driver

        Thread.sleep(2000);
        driver.manage().window().maximize();//this line will maximize our browser

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //before you move on any website driver will be opened in empty page
        //url will be empty as well


        Thread.sleep(2000);
        //lets go to amazon.com

        driver.get("https://www.amazon.ca/");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());//Amazon.ca: Low Prices – Fast Shipping – Millions of Items

        Thread.sleep(2000);
        driver.close();

    }

}
