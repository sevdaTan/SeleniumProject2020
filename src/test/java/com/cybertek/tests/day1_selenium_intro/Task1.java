package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
TC	#1:	Google	Title	Verification
     1.Open	Chrome	browser
     2.Go	to	https://www.google.com3.Verify	title:
	Expected:	Google
 */
public class Task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String title = driver.getTitle();

        System.out.println("Expected: " + title);


    }
}

