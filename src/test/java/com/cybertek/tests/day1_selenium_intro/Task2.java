package com.cybertek.tests.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC	#2:	Cybertek verifications
1.Open	Chrome	browser
2.Go to	https://practice.cybertekschool.com
3.Verify URL contains Expected:	cybertekschool
4.Verify title:	Expected:	Practice
 */
public class Task2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String url = driver.getCurrentUrl();
        System.out.println("Expected url: "+ url);

        String expectedTitle = driver.getTitle();
        System.out.println("Expected title: "+ expectedTitle);



    }
}
