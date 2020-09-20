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

/*
TC #3: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select “December 1st, 1921” and verify it is selected.
   Select year using : visible text
   Select month using : value attribute
   Select day using: index number
 */
public class TC3_SelectingDate {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver =  WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void DateDropdown() throws InterruptedException {
        Select yearDropdownList = new Select(driver.findElement(By.id("year")));
        yearDropdownList.selectByVisibleText("1921");
        Thread.sleep(2000);
        String actualSelectedYear = yearDropdownList.getFirstSelectedOption().getText();
        String expectedSelectedYear = "1921";

        Assert.assertTrue(expectedSelectedYear.equals(actualSelectedYear));
        Thread.sleep(2000);
        System.out.println("Expected year is selected. Verification PASSED!");

        Select monthDropdownList = new Select(driver.findElement(By.id("month")));
        Thread.sleep(2000);
        monthDropdownList.selectByValue("11");
        String actualSelectedMonth = monthDropdownList.getFirstSelectedOption().getText();
        String expectedSelectedMonth = "December";

        Assert.assertTrue(expectedSelectedMonth.equals(actualSelectedMonth));
        Thread.sleep(2000);
        System.out.println("Expected month is selected. Verification PASSED!");

        Select dayDropdownList = new Select(driver.findElement(By.id("day")));
        Thread.sleep(2000);
        dayDropdownList.selectByIndex(0);
        String actualSelectedDay = dayDropdownList.getFirstSelectedOption().getText();
        String expectedSelectedDay = "1";

        Assert.assertTrue(expectedSelectedDay.equals(actualSelectedDay));

        Thread.sleep(3000);
        System.out.println("Expected day is selected. Verification PASSED!");

    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }


}
