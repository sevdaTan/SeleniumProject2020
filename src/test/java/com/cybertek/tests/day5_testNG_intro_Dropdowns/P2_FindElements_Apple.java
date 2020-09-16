package com.cybertek.tests.day5_testNG_intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
TC #03: FINDELEMENTS_APPLE1.Open Chrome browser
2.Go to https://www.apple.com
3.Click to all of the headers one by one
a.Mac, iPad, iPhone, Watch, TV, Music, Support
4.Printout how many links on each page with the titles of the pages
5.Loop through all
6.Print out how many link is missing textTOTAL
7.Print out how many link has textTOTAL
8.Print out how many total linkTOTAL
 */
public class P2_FindElements_Apple {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.apple.com");

        //3.Click to all of the headers one by one
        //a.Mac, iPad, iPhone, Watch, TV, Music, Support
        driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-mac']")).click();

        //4.Printout how many links on each page with the titles of the pages


        //5.Loop through all


        //6.Print out how many link is missing textTOTAL


        //7.Print out how many link has textTOTAL


        //8.Print out how many total linkTOTAL

    }
}
