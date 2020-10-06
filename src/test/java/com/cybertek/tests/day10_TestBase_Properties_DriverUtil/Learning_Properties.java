package com.cybertek.tests.day10_TestBase_Properties_DriverUtil;

import org.testng.annotations.Test;

public class Learning_Properties {


    @Test
    public void java_properties_test(){
        System.getProperty("System.getProperty(\"os.name\")= "+ System.getProperty("os.name"));

        System.getProperty("System.getProperty(\"user.name\")= "+ System.getProperty("user.name"));



    }



}
