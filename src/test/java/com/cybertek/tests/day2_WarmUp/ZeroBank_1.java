package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Zero Bank title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify titleExpected: “Zero -Log in”
 */
public class ZeroBank_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");


    }
}
