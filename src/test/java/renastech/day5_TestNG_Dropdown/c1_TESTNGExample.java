package renastech.day5_TestNG_Dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class c1_TESTNGExample {
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
    @Test(priority = 3, dependsOnMethods = "TC3_test")//TC1_test depends on TC3_test so if TC3 fail it will skip this one
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

    @Ignore //will ignore this test and not run
    @Test
    public void TC4_test(){
        System.out.println("Running Test4");
    }
}
