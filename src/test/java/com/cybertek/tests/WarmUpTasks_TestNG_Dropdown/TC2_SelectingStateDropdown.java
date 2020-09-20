package com.cybertek.tests.WarmUpTasks_TestNG_Dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_SelectingStateDropdown {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver =  WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void stateDropdown() throws InterruptedException {
        Select stateDropdownList = new Select(driver.findElement(By.id("state")));
        stateDropdownList.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateDropdownList.selectByValue("VA");
        Thread.sleep(2000);
        stateDropdownList.selectByIndex(5);
        Thread.sleep(2000);

       String actualSelected = stateDropdownList.getFirstSelectedOption().getText();
       String expectedSelected = "California";

        Assert.assertTrue(expectedSelected.equalsIgnoreCase(actualSelected));

    }
    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }


}
