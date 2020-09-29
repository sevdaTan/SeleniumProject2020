package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {
    /*
    Mini-Task:
    • Create a method called loginToSmartBear
    • This method simply logs in to SmartBear when you call it.
    • Accepts WebDriver type as parameter
     */
    public static void loginToSmartBear(WebDriver driver){

//        driver = WebDriverFactory.getDriver("chrome");
//        //implicit wait
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //get the page
//        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//

        // Enter username: “Tester”
        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        // Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        // Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }

    //verify order method
    /*• Method should verify if given name exists in orders.
        • This method should simply accepts a name(String), and assert whether
        given name is in the list or not.
        • Create a new TestNG test to test if the method is working as expected.
 */
    public static void verifyOrder(WebDriver driver,String name) {
        //Created a locator that only returns the names of the customer from all the rows
        //Created a list and stored the cells that has customer name information into it
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //If there is only one table on the page, you don't have to locate the table. --> //tr/td[2]
        //List<WebElement> nameList = driver.findElements(By.xpath("//tr/td[2]"));

        // for each loop shortcut: type iter, press tab
        for (WebElement each : nameList) {
            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }
        }
        // Assert fail method will fail the test when it is called, no matter what
        Assert.fail("Name: " + name + " does not exist on the list! Verification FAILED!!!");
    }
/*• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
• Create a new TestNG test to test if the method is working as expected.
• Output should be like:
• Name1: name , City1: city
• Name2: name , City2: city
 */
        public static void printNamesAndCities (WebDriver driver){
            //Locating all the names from all the rows and storing in a list of web element
            List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

            // we need to locate all the cities from all the rows
            List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));


            // shortcut for for loop => fori, then enter
            for (int i = 0; i < namesList.size(); i++) {
                System.out.println("Name " + (i + 1) + ":" + namesList.get(i).getText() + ", City " + (i + 1) + ":" + citiesList.get(i).getText());
            }
        }


    }

