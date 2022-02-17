package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c6_getText_getAttribute {
    public static void main(String[] args) {
        //create connection between driver and browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement gmailButton=driver.findElement(By.linkText("Gmail"));

        System.out.println("gmailButton.getText() = " + gmailButton.getText());
        System.out.println("gmailButton.getAttribute(\"href\") = " + gmailButton.getAttribute("href"));
        System.out.println("gmailButton.getAttribute(\"class\") = " + gmailButton.getAttribute("class"));

       WebElement aboutButton=driver.findElement(By.className("MV3Tnb"));
        System.out.println("aboutButton = " + aboutButton);

        System.out.println("aboutButton.getAttribute(\"href\") = " + aboutButton.getAttribute("href"));
        System.out.println("aboutButton.getAttribute(\"ping\") = " + aboutButton.getAttribute("ping"));

        driver.close();
    }
}
