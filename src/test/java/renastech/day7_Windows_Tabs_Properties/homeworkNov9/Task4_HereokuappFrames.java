package renastech.day7_Windows_Tabs_Properties.homeworkNov9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.base.TestBase;

import java.util.List;

//Task4
//go to http://the-internet.herokuapp.com/nested_frames
//switch between frames
//get text for each frame hint: use tagname to locate text or xpath
public class Task4_HereokuappFrames extends TestBase {
    @Test
    public void TC1_switchFrames(){
        driver.get("http://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement messageBox=driver.findElement(By.id("content"));
        System.out.println("messageBox.getText() = " + messageBox.getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        WebElement messageBox1=driver.findElement(By.tagName("body"));
        System.out.println("messageBox1.getText() = " + messageBox1.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement messageBox2=driver.findElement(By.tagName("body"));
        System.out.println("messageBox2.getText() = " + messageBox2.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        WebElement messageBox3=driver.findElement(By.tagName("body"));
        System.out.println("messageBox3.getText() = " + messageBox3.getText());

    }

}
