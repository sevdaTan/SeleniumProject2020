package com.cybertek.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Zero Bank link text verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify link text from top left:
Expected: “Zero Bank”
4.Verify link hrefattribute value contains:
Expected: “index.html”
 */
public class ZeroBank_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

    }
}
