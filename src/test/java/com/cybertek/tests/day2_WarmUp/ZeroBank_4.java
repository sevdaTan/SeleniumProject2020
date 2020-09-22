package com.cybertek.tests.day2_WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4: Zero Bank login title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Enter username: username
4.Enter password: password
5.Click to “Account Activity” link
6.Verify title changed to:
Expected: “Zero –Account Activity”
7.Click to “Transfer Funds” link
8.Verify title changed to:
Expected: “Zero –Transfer Funds”
9.Click to “Pay Bills” link
10.Verify title changed to:
Expected: “Zero -Pay Bills”
11.Click to “My Money Map” link
12.Verify title changed to:
Expected: “Zero –My Money Map”
13.Click to “Online Statements” link
14.Verify title changed to:
Expected: “Zero –Online Statements”
 */
public class ZeroBank_4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(1000);
        WebElement login = driver.findElement(By.id("user_login"));
        login.sendKeys("username");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("password");
        Thread.sleep(1000);

        WebElement signIn = driver.findElement(By.name("submit"));
        signIn.click();
        Thread.sleep(2000);

       // 5.Click to “Account Activity” link
        WebElement accountActivity = driver.findElement(By.linkText("Account Activity"));
        accountActivity.click();
        Thread.sleep(2000);

        //6.Verify title changed to:
        //Expected: “Zero – Account Activity”
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Account Activity Verification PASSED!");
        }else{
            System.out.println("Account Activity Verification FAILED!");
        }
        Thread.sleep(2000);
        //7.Click to “Transfer Funds” link
        WebElement transferFunds = driver.findElement(By.linkText("Transfer Funds"));
        transferFunds.click();

        //8.Verify title changed to:
        //Expected: “Zero – Transfer Funds”
        String expectedTitle2 = "Zero - Transfer Funds";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Transfer Funds Verification PASSED!");
        }else{
            System.out.println("Transfer Funds Verification FAILED!");
        }
        Thread.sleep(2000);
        //9.Click to “Pay Bills” link
        WebElement payBills = driver.findElement(By.linkText("Pay Bills"));
        payBills.click();

        //10.Verify title changed to:
        //Expected: “Zero - Pay Bills”
        String expectedTitle3 = "Zero - Pay Bills";
        String actualTitle3 = driver.getTitle();
        if (actualTitle3.equals(expectedTitle3)){
            System.out.println("Pay Bills Verification PASSED!");
        }else{
            System.out.println("Pay Bills Verification FAILED!");
        }
        Thread.sleep(2000);
        //11.Click to “My Money Map” link
        WebElement myMoneyMap = driver.findElement(By.linkText("My Money Map"));
        myMoneyMap.click();

        //12.Verify title changed to:
        //Expected: “Zero – My Money Map”
        String expectedTitle4 = "Zero - My Money Map";
        String actualTitle4 = driver.getTitle();
        if (actualTitle4.equals(expectedTitle4)){
            System.out.println("My Money Map Verification PASSED!");
        }else{
            System.out.println("My Money Map Verification FAILED!");
        }

        Thread.sleep(2000);
        //13.Click to “Online Statements” link
        WebElement onlineStatements = driver.findElement(By.linkText("Online Statements"));
        onlineStatements.click();

        //14.Verify title changed to:
        //Expected: “Zero – Online Statements”
        String expectedTitle5 = "Zero - Online Statements";
        String actualTitle5 = driver.getTitle();
        if (actualTitle5.equals(expectedTitle5)){
            System.out.println("Online Statements Verification PASSED!");
        }else{
            System.out.println("Online Statements Verification FAILED!");
        }


    }
}
