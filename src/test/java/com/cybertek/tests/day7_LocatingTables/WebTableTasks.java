package com.cybertek.tests.day7_LocatingTables;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC#3: Smartbear software order verification
1.Open browser and login to Smartbear software
2.Click on View all orders
3.Verify Susan McLaren has order on date “01/05/2010”
 */
public class WebTableTasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }


    @Test
    public void p3_verify_susans_order_date(){

        WebElement susanDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        String expectedDate = "01/05/2010";
        String actualDate = susanDate.getText();

        Assert.assertTrue(actualDate.equals(expectedDate),"Actual Date is not equal to expected date");
        Assert.assertEquals(actualDate,expectedDate,"Actual Date is not equal to expected date");

       // Assert.fail("I'm failing this test on purpose");
        //TODO:THIS IS ON PURPOSE FAILING
    }


}
