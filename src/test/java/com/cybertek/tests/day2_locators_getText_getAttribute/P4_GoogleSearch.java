package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
/*
TC#4:	Google	search
1-Open	a	chrome	browser
2-Go	to:	https://google.com
3-Write	“apple”	in	search	box
4-Click	google	search	button
5-Verify	title:Expected:
Title	should	start	with	“apple”
 */

        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open chrome driver
        WebDriver driver = new ChromeDriver();

        //Go	to:	https://google.com
        driver.get("https://google.com");

        //Write	“apple”	in	search	box
        //Click	google	search	button
        //1-Finding the search box --> 2- sending the keys --> 3- Enters
        driver.findElement(By.name("q")).sendKeys("apple" + Keys. ENTER);

        //-Verify	title:Expected:
        //Title	should	start	with	“apple - Google Search”

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else{
            System.out.println("Search title verification FAILED!");
        }


    }
}
