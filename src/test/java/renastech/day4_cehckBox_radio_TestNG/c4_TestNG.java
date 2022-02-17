package renastech.day4_cehckBox_radio_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c4_TestNG {
   // @AfterMethod
//    @BeforeMethod
//    @Test

    @BeforeMethod
    public void setup(){//this method will run before each test method
        System.out.println("Before method is Running");
    }

    @AfterMethod
    public void closing(){//this method will run after each test method
        System.out.println("After method is running");
    }

    @Test
    public void TC1_test(){
        System.out.println("Test 1 is running");
    }

    @Test
    public void TC3_test(){
        System.out.println("Test 3 is running");
    }

    @Test
    public void TC2_test(){
        System.out.println("Test 2 is running");
    }


}
