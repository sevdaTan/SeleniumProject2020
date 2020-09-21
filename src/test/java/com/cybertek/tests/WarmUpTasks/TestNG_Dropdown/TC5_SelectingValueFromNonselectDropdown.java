package com.cybertek.tests.WarmUpTasks.TestNG_Dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC #5: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */
public class TC5_SelectingValueFromNonselectDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
//3. Click to non-select dropdown
    @Test
    public void nonSelectDropdown() throws InterruptedException {
        WebElement dropdownMenuLink = driver.findElement(By.id("dropdownMenuLink"));
        // By.xpath("//div[@class='dropdown']/a") ==> parent to child example
        dropdownMenuLink.click();
        Thread.sleep(2000);

        //4. Select Facebook from dropdown
        driver.findElement(By.linkText("Facebook")).click();
        // By.xpath("//a[.='Facebook']")
        Thread.sleep(1000);

        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Thread.sleep(2000);
        Assert.assertEquals(actualTitle,expectedTitle,"The title is not matching, Verification Failed!");
    }

        @AfterMethod
        public void teardownMethod(){
        driver.close();
    }

}
