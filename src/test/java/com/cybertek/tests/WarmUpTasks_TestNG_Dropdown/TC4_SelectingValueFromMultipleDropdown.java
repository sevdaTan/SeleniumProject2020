package com.cybertek.tests.WarmUpTasks_TestNG_Dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
TC #4: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */
public class TC4_SelectingValueFromMultipleDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void MultipleSelectDropdown() throws InterruptedException {
        WebElement multiSelectDropdownElement = driver.findElement(By.cssSelector("select[name='Languages']"));
        //3. Select all the options from multiple select dropdown.
        Select multipleDropdownElement = new Select(multiSelectDropdownElement);
        for (int i = 0; i < 6; i++){
            multipleDropdownElement.selectByIndex(i);
        }

        //4. Print out all selected values.

        List<WebElement> allSelectedOptions = multipleDropdownElement.getAllSelectedOptions();

        for(WebElement each : allSelectedOptions){
            System.out.println(each.getText());
           Thread.sleep(1000);
        }

        //5. Deselect all values.
        multipleDropdownElement.deselectAll();
        Thread.sleep(1000);
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

}