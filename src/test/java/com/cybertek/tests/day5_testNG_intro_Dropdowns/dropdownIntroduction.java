package com.cybertek.tests.day5_testNG_intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4.Verify“State selection” default selected value is correct
Expected: “Select a State”
 */
public class dropdownIntroduction {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void dropdown_test1() throws InterruptedException {
    //3.Verify “Simple dropdown” default selected value is correct
    //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualSelectedOption = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Please select an option";

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);

        Thread.sleep(3000);
        simpleDropdown.selectByVisibleText("Option 2");


     //4.Verify“State selection” default selected value is correct
    //Expected: “Select a State”



    }


}
