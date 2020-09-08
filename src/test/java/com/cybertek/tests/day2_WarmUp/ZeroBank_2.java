package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link Text Verification Passed!");
        }else{
            System.out.println("Link Text Verification Failed!");
        }

        String expectedHref = "index.html";
        String actualHrefValue = zeroBankLinkTopLeft.getAttribute("href");

        if (actualHrefValue.contains(expectedHref)){
            System.out.println("Href Value Verification Passed!");
        }else {
            System.out.println("Href Value Verification Failed!");
        }


    }
}
