package com.cybertek.tests.day5_testNG_intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/*
TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
1.Open	Chrome	browser
2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
3.Verify	“Success	–Check	box	is	checked”	message	is	NOT displayed.
4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
5.Verify	“Success	–Check	box	is	checked”	message	is displayed.
 */
public class P05_SeleniumEasy_Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement successCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        //3.Verify	“Success	–Check	box	is	checked”	message	is	NOT displayed.
        if (!successMessage.isDisplayed()){
            System.out.println("Success message is not displayed. Verification passed!");
        }else{
            System.out.println("Success message is displayed. Verification failed!");
        }

    //4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        successCheckBox.click();

    //5.Verify	“Success	–Check	box	is	checked”	message	is displayed.
        if (successMessage.isDisplayed()){
            System.out.println("Success message is displayed. Verification passed!");
        }else{
            System.out.println("Success message is not displayed. Verification failed!");
        }

        Thread.sleep(4000);
        driver.close();

    }
}
