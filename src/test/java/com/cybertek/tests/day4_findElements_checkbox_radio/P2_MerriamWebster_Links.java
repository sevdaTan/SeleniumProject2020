package com.cybertek.tests.day4_findElements_checkbox_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
TC #0: FIND ELEMENTS
1.Open Chrome browser
2.Go to https://www.merriam-webster.com/
3.Print out the texts of all links
4.Print out how many link is missing text
5.Print out how many link has text
6.Print out how many total link
 */
public class P2_MerriamWebster_Links {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.merriam-webster.com/");

      //  3.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks){
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()){
               linksWithoutText++;
            }else{
                linksWithText++;
            }

        }


       //4.Print out how many link is missing text

        System.out.println("The number of links that does not have text = "+  linksWithoutText );

        //5.Print out how many link has text
        System.out.println("The number of links that HAS text = "+ linksWithText);

        //6.Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println("Number of Total Links on this Page : "+ listOfLinks.size());



    }
}
