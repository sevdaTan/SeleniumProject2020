package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Zero Bank login title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Enter username: username
4.Enter password: password
5- sign in
6.Verify title changed to:
Expected: “Zero –Account Summary”
 */
public class ZeroBank_3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("username");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signIn = driver.findElement(By.name("submit"));
        signIn.click();
        Thread.sleep(2000);

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }


    }
}
