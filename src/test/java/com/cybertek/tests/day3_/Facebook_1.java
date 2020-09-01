package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
C #1: Facebook title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify title:
Expected: “Facebook -Log In or Sign Up”
 */
public class Facebook_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedTitle = "Facebook -Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verify Title  PASSED!");
        }else{
            System.out.println("Verify Title FAILED!");
        }

    }
}
