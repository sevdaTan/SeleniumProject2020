package com.cybertek.tests.day5_testNG_intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_introduction {


    @BeforeClass// It runs only once, before everything
    public void setUpClass(){
        System.out.println("Before class is running...");
    }
    @AfterClass// It runs only once, after everything is done
    public void teardownClass(){ // teardown = closing
        System.out.println("After class is running...");
    }

    @BeforeMethod // it runs every time before each test
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }
    @AfterMethod // it runs every time after each test
    public void teardownMethod(){
        System.out.println("After method is running...");
    }

// by default the tests are running by alphabetical order,
// but we can specify priority in between them

  // each test is independent
    @Test // @ --> annotation is a way of controlling the flow of Test
    public void test1(){
        System.out.println("Test1 is running...");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running..");
    }
    @Test
    public void test3(){
       String str1 = "TestNG";
       String str2 = "TestNG";
       String str3 = "sevda";

        Assert.assertTrue(str1.equals(str2));// Pass
        Assert.assertTrue(str1.equals(str3),"str1 is not equal to str3"); // Fail
        Assert.assertFalse(str1.equals(str3));// Pass

        Assert.assertEquals(str1,str2,"Failure message just in case: str1 is not equal to str2");//pass
    }


}
