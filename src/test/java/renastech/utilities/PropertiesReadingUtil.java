package renastech.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    //1- create properties object
    //2- get the path and store in String
    //3-  open the file use Fileinputstream method
    //4-  load the file to properties object by using load method from properties
    //5- close.file
    //plus dont forget to handle exceptions

    //******reading properties file is another type of encapsulation we can use in answer

    private static Properties properties=new Properties();
    //encapsulation hide the data

    static {//will get execute before everything
//2- get the path and store in String
        String pathForPropertiesFile="configuration.properties";//path of file
//3-  open the file use Fileinputstream method
        //we need to tell compiler to open this file
        try {
            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);//basically we are doing inheritence here from config file

            //4-  load the file to properties object by using load method from properties
            properties.load(fileInputStream);//file needs to be loaded in the automation
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties files not founded!!");

        }
    }

    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }
}


