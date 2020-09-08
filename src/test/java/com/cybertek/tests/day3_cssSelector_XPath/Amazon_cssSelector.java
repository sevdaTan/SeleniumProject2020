package com.cybertek.tests.day3_cssSelector_XPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
CSSPracticeDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.TC
#3: Amazon link number verification
1. Open Chrome browser
2. Go to https://www.amazon.com
3. Enter search term
(use cssSelector to locate search box)
4. Verify title contains search term
 */
public class Amazon_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.amazon.com");

       // WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));



        searchBox.sendKeys("wooden spoon" + Keys.ENTER);



    }
}
