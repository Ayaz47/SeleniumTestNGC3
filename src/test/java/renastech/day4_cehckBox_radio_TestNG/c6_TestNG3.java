package renastech.day4_cehckBox_radio_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c6_TestNG3 {

    @BeforeClass
    public void setupClass(){//this one will only run once before everything in the class
        System.out.println("Before class is running");
    }
    @AfterClass
    public void setupAfterClass(){//this one will only run once after everything in the class
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setup(){//this will run before each test annotation
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void closing(){//this will run after each test annotation
        System.out.println("After method is running");
    }
    @Test(priority = 3)
    public void TC1_test(){
        System.out.println("Test 1 is running");
    }
    @Test(priority = 1)
    public void TC3_test(){
        System.out.println("Test 3 is running ");
        String actualword="hello";
        String expectedword="hello2";

        Assert.assertEquals(actualword,expectedword);
        System.out.println("continue test3");
    }

    @Test(priority = 2)
    public void TC2_test(){
        System.out.println("Test 2 is running");
        String str="renastech";
        String str2="renastech";

        Assert.assertTrue(str.equals(str2));
    }
}
