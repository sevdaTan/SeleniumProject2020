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
Verifying “Simple dropdown” and “State selection” dropdown default values
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */
public class TC1_SimpleDropdown {

WebDriver driver;


@BeforeMethod
public void setupMethod(){
   driver =  WebDriverFactory.getDriver("chrome");
   driver.get("http://practice.cybertekschool.com/dropdown");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

}
@Test
    public void SimpleDropdown(){
    Select dropdown = new Select(driver.findElement(By.id("dropdown")));
    String actualResult = dropdown.getFirstSelectedOption().getText();
    String expectedResult = "Please select an option";

    Assert.assertEquals(expectedResult,actualResult);

}
@Test
   public void selectState(){
    Select stateDropdown = new Select(driver.findElement(By.id("state")));
    String actualStateResult = stateDropdown.getFirstSelectedOption().getText();
    String expectedStateResult = "Select a State";
Assert.assertEquals(actualStateResult,expectedStateResult);
}


@AfterMethod
public void teardownMethod(){
    driver.quit();
}

}
