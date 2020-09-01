package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Back and forth navigation
1-Open a chrome browser
2-Go to: https://google.com
3-Click to Gmail from top right.
4-Verify title contains:Expected: Gmail
5-Go back to Google by using the .back();
6-Verify title equals:Expected: Google
 */

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        // setting up the browser driver
        WebDriverManager.chromedriver().setup();

        // open browser and create an instance of the driver
        WebDriver driver = new ChromeDriver();

        // Go to: https://google.com
        driver.get("https://google.com");

        //Click to Gmail from top right.
        // we are locating the "Gmail" link web elementusing findElement method and LinkText LOCATOR
        driver.findElement(By.linkText("Gmail")).click();

        //Verify title contains:
        // Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!");
        }

        // Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(5000);

        //Verify title equals:Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!");
        }





    }
}
