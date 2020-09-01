package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4: Zero Bank login title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Enter username: username
4.Enter password: password
5.Click to “Account Activity” link
6.Verify title changed to:
Expected: “Zero –Account Activity”
7.Click to “Transfer Funds” link
8.Verify title changed to:
Expected: “Zero –Transfer Funds”
9.Click to “Pay Bills” link
10.Verify title changed to:
Expected: “Zero -Pay Bills”
11.Click to “My Money Map” link
12.Verify title changed to:
Expected: “Zero –My Money Map”
13.Click to “Online Statements” link
14.Verify title changed to:
Expected: “Zero –Online Statements”
 */
public class ZeroBank_4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");


    }
}
