package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify header text is as expected:
Expected:“Connect with friends and the world around you on Facebook.”
 */
public class Facebook_3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String actualText = driver.findElement(By.tagName("h2")).getText();// getText() kullanildigi icin returns String
        String expectedText = "Connect with friends and the world around you on Facebook.";

        if (actualText.equals(expectedText)){
            System.out.println("Header Verification Passed!");
        }else{
            System.out.println("Header Verification Failed!");
        }
            driver.close();

    }
}
