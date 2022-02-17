package renastech.day7_Windows_Tabs_Properties;

import org.testng.annotations.Test;
import renastech.utilities.PropertiesReadingUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c4_PropertiesPractice {
    @Test
    public void TC1_systemProperties(){
        //java has some ready properties that you can get system info
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
    @Test
    public void TC2_configurationProperties() throws FileNotFoundException {
        //tobe able to make our code understand properties file i need to connect to my file

        Properties properties=new Properties();

        String pathForPropertiesFile="configuration.properties";
        //we need to get path of file either absolute or root

        //we need to tell compiler to open this file

        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
        //we use load method that comes from properties class
        try {
            properties.load(fileInputStream);//file needs to be loaded in the automation
        } catch (IOException e) {
            e.printStackTrace();
        }

        //now we can read the file

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));

    }
    @Test
    public void TC3_configurationProperties() throws FileNotFoundException {
        System.out.println(PropertiesReadingUtil.getProperties("SmartBear_url"));
        System.out.println(PropertiesReadingUtil.getProperties("SmartBear_username"));


    }
}
