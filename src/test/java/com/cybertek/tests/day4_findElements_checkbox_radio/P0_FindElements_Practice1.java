package com.cybertek.tests.day4_findElements_checkbox_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
TC #0: FINDELEMENTS1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Print out the texts of all links
4.Print out how many total link
 */
public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3.Print out the texts of all links
       // WebElement textLinks = driver.findElement(By.xpath("//body//a"));

        // Locating all the links on the page and storing them into a list of Web Elements
        List<WebElement> textLinks = driver.findElements(By.xpath("//body//a"));

       // Looping through the list of webElements we just created above
        for (WebElement eachLink : textLinks){
            // Getting the text of each element in each iteration and printing the values
            System.out.println(eachLink.getText());
        }

        //4.Print out how many total link
        int numberOfLinks = textLinks.size();
        System.out.println("Number of Links: "+ numberOfLinks);

    }
}
