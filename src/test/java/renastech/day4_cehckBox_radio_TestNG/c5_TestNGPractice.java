package renastech.day4_cehckBox_radio_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class c5_TestNGPractice {

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
    @Test
    public void TC1_test(){
        System.out.println("Test 1 is running");
    }
    @Test
    public void TC3_test(){
        System.out.println("Test 3 is running ");

    }

    @Test
    public void TC2_test(){
        System.out.println("Test 2 is running");
    }

}
