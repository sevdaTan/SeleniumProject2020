package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #2: Facebook incorrect login title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to:
Expected: “Log into Facebook | Facebook”
 */
public class Facebook_2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("sssss@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("9878999");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);

        String actualResult = driver.getTitle();
        String expectedResult = "Log into Facebook | Facebook";



        if (actualResult.equals(expectedResult)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.close();

    }
}
