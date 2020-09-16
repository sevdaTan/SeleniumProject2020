package com.cybertek.tests.day5_testNG_intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
TC #02: FINDELEMENTS_APPLE
1.Open Chrome browser
2.Go to https://www.apple.com
3.Click to iPhone
4.Print out the texts of all links
5.Print out how many link is missing text
6.Print out how many link has text
7.Print out how many total link
 */
public class P1_FindElements_Apple {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");

        //3.Click to iPhone
        WebElement iphone = driver.findElement(By.xpath("//span[.='iPhone']"));

        //4.Print out the texts of all links
       List <WebElement> listOfAllLinks = driver.findElements(By.xpath("//body//a"));

               int linksWithoutText = 0;
               int linksWithText = 0;

               for (WebElement eachLink : listOfAllLinks){
                   String textOfEachLink = eachLink.getText();

                   System.out.println(textOfEachLink);
                   if (textOfEachLink.isEmpty()){
                       linksWithoutText++;
                   }else{
                       linksWithText++;
                   }
               }

        //5.Print out how many link is missing text
        System.out.println("Number of links that do not have text: " + linksWithoutText);

        //6.Print out how many link has text
        System.out.println("Number of links that have text: "+ linksWithText);

        //7.Print out how many total link
        int numberOfLinks = listOfAllLinks.size();
        System.out.println("Total number of links: "+ numberOfLinks);

    }
}
