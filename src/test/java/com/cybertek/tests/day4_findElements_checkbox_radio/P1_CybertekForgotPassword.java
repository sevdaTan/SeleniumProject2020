package com.cybertek.tests.day4_findElements_checkbox_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
 a. “Home” link
 b. “Forgot password” header
 c.“E-mail” text
 d. E-mail input box.
 e.“Retrieve password” button
 f. “Powered by Cybertek School” text
 4. Verify all WebElements are displayed.
 B. Better if you do with both XPATHand CSSselector for practice purpose
 */
public class P1_CybertekForgotPassword {
    public static void main(String[] args) {
       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        //WebElement homeLink = driver.findElement(By.xpath("//a[@href='/']"));

        //b. “Forgot password” header
        WebElement header = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // c.“E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        // e.“Retrieve password” button
       // WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit"));
       // WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
       // WebElement retrievePassword = driver.findElement(By.cssSelector("button[class='radius']"));
      WebElement retrievePassword = driver.findElement(By.cssSelector("button.radius"));



        //f. “Powered by Cybertek School” text
        WebElement linkText = driver.findElement(By.xpath("//a[.='Cybertek School']"));
        WebElement poweredByDiv = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("LinkText = "+ linkText.getText());
        System.out.println("PoweredByDiv = "+ poweredByDiv.getText());


        //4. Verify all WebElements are displayed

        if (homeLink.isDisplayed() && emailLabel.isDisplayed() && emailInput.isDisplayed()
                && retrievePassword.isDisplayed() && poweredByDiv.isDisplayed()){
            System.out.println("All web elements are displayed, verification passed!");
        }else{
            System.out.println("All web elements are not displayed, verification failed!");
        }


    }
}
