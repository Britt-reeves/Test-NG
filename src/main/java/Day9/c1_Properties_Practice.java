package Day9;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c1_Properties_Practice {

    //
    @Test
    public void TC_1System_Properties(){

        //java has some ready properties we can retrieve system information from
        System.out.println(System.getProperty("os.name"));


    }
@Test
    public void TC2_Configuration_Properties() throws FileNotFoundException {
        //to make our code understand property files we will create a property file
    Properties properties= new Properties();
String pathForPropertiesFile="configuration.properties";
//get the path for the configuration file / property file
    FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);
    //now create the try catch block, but here is to try the url and if it goes wrong it will catch it.
    //we need to tell the compiler to open the file
    try{
        properties.load(fileInputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }//if the try doesnt work then it will go for the catch exception
    //the file needs to be loaded in the  automation.
    System.out.println(properties.getProperty("SmartBear_url"));
    System.out.println(properties.getProperty("SmartBear_username"));
}




}
