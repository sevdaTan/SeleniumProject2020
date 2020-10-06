package com.cybertek.tests.day10_TestBase_Properties_DriverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

    // Properties: use Properties class object
    // we create properties obj to be able to read configuration.properties file
    // import from java.util
        Properties properties = new Properties();

    // FileInputStream: opens the file
        String path = "configuration.properties";

    // we need to pass the path of the file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

    // We will load the file
        properties.load(file);

    // We read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        //shortcut ->  properties.getProperty("username").soutv + enter
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    // We will close the file
        file.close();






    }


    @Test
    public void using_properties_utility_method(){

        // This will read given "keys" value and return it as a String
       // ConfigurationReader.getProperty("browser").soutv;
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
       // ConfigurationReader.getProperty("smartbearUrl").soutv;
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));

    }

}
