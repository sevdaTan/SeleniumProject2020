package com.cybertek.tests.day3_cssSelector_XPath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #3: PracticeCybertek/ForgotPassword URL verification
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Enter any email into input box
4.Click on Retrieve password
5.Verify URL contains: Expected: “email_sent”
6.Verify textbox displayed the content as expected.
Expected: "Your e-mail’s been sent!"
 */
public class WarmupTask {
    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");



        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

     //  driver.findElement(By.name("email")).sendKeys("sss@cybertekschools.com");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("sss@cybertekschools.com");

    //   driver.findElement(By.id("form_submit")).click();
       WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
       retrievePasswordButton.click();
       Thread.sleep(2000);


      String expectedURL = "email_sent";
      String actualURL = driver.getCurrentUrl();
      if (actualURL.contains(expectedURL)){
        System.out.println("URL Verification PASSED!");
      }else{
        System.out.println("URL Verification FAILED!");
    }
      WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
      confirmationMessage.getText();

        String actualText = confirmationMessage.getText();
        String expectedText = "Your e-mail's been sent!";

        if (actualText.equals(expectedText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text Verification FAILED");
        }

        if (confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed. Verification is passed!");
        }else{
            System.out.println("Confirmation message is not displayed. Verification is failed!");

        }
       // driver.close();



    }
}
