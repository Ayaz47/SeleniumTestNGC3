package renastech.day11_xmlFiles;

import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c1_googletest extends TestBase2 {
    //verify title has changed after you click on gmail button

    @Test
    public void test(){
        DriverUtil.getDriver().get("https://www.google.com");
    }
}

//we have extended TestBase2 using logic of inheritence
//we get before and after methods
//we create page class googleMainPage
//and we stored web elements: such as gmail button
// and some usefull methods
//create an object from page to be able to call webelements and methods
//you navigate your url with using properties file and properties util
//then you click on gmail button
//then you get title
// then you verify title changed
