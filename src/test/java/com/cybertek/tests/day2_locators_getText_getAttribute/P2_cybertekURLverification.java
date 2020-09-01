package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_cybertekURLverification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("URL verification PASSED!!!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }
        /*
        String expectedTitle = "practice";
        String actualTitle = driver.getTitle();
        if (driver.getTitle().equalsIgnoreCase("practice")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
        */

        if (driver.getTitle().equalsIgnoreCase("practice")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }




    }
}
