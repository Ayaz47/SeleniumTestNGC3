package renastech.study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
//        driver.get("https://practice.automationbro.com/cart/");
//        String pathoffile="C:\\Users\\oralr\\Desktop\\bootcamp\\selenium\\SeleniumDay1_RenasTech-1.pdf";
//       WebElement uploadbox= driver.findElement(By.id("fileName_1"));
//
//
//        Actions actions=new Actions(driver);
//        actions.sendKeys(uploadbox,pathoffile).perform();
//       actions.click(driver.findElement(By.id("upload_1"))).perform();

        //fileName_1
//        driver.get("https://practicerenastech.com");
//       WebElement element= driver.findElement(By.xpath("//*[@id=\"project-Insurance\"]/p/mat-icon"));
//        System.out.println(element.getLocation());
//        driver.findElement(By.xpath("//*[@id=\"get-a-quote\"]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/p/mat-form-field/div/div[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]")).click()


        try {
            FileInputStream ExcelFile = new FileInputStream("C:\\Users\\oralr\\Desktop\\file.xlsx");
            XSSFWorkbook workbook=new XSSFWorkbook(ExcelFile);
            XSSFSheet sheet=workbook.getSheetAt(0);

            XSSFCell cell=sheet.getRow(0).getCell(0);
            System.out.println(cell.toString());
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
