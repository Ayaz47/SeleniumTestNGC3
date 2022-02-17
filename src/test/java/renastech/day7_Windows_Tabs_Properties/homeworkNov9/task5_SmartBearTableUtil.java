package renastech.day7_Windows_Tabs_Properties.homeworkNov9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;
import renastech.utilities.SmartBearUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class task5_SmartBearTableUtil extends TestBase2 {
    //Task5
//create a util method that will verify given state name is present in the smart bear table (edited)
    public static void verifyNameFromTable(String enterState){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.loginForSmartBear(DriverUtil.getDriver());
        List<WebElement> statesList=DriverUtil.getDriver().findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[8]"));

        for (WebElement eachState : statesList){
            if (eachState.getText().equals(enterState)){
               Assert.assertTrue(eachState.getText().equals(enterState));
                return;//if you delete your return it will trigger the fail
                //without return it doesnt check any true
            }
        }
        Assert.fail("State is not present in the table.");
    }

    @Test(dataProvider = "dataForTable")
    public void TC1_verifyGivenNameInTable(String enterState){
        verifyNameFromTable(enterState);
    }

   @DataProvider(name="dataForTable")
    public static Object[][] dataSetForTable(){

        return new Object[][]{
                {"US"},
                {"Canada"},
                {"TURKEY"},
                {"Great Britain"},
                {"ICELAND"}
        };
    }


}
