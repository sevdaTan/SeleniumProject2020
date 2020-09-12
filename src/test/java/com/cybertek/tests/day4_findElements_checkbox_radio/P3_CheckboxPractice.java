package com.cybertek.tests.day4_findElements_checkbox_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
Practice:	Cybertek	Checkboxes
1.Go	to	http://practice.cybertekschool.com/checkboxes
2.Confirm	checkbox	#1	is	NOT	selected	by	default
3.Confirm	checkbox	#2	is	SELECTED	by	default.
4.Click	checkbox	#1	to	select	it.
5.Click	checkbox	#2	to	deselect	it.
6.Confirm	checkbox	#1	is	SELECTED.
7.Confirm	checkbox	#2	is	NOT
 */
public class P3_CheckboxPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");


        //Locating first checkbox
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));


        //Locating second checkbox
        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        //2.Confirm	checkbox	#1	is	NOT	selected	by	default
        if (!checkBox1.isSelected()){
            System.out.println("Checkbox1 is not selected. Verification is passed!");
        }else{
            System.out.println("Checkbox1 is selected. Verification is failed!");
        }

        //3.Confirm	checkbox	#2	is	SELECTED	by	default.
        if (checkBox2.isSelected()){
            System.out.println("Checkbox2 is selected. Verification is passed!");
        }else{
            System.out.println("Checkbox2 is not selected. Verification is failed!");
        }

        //4.Click	checkbox	#1	to	select	it.
       Thread.sleep(1000);
        checkBox1.click();

        //5.Click	checkbox	#2	to	deselect	it.
        Thread.sleep(1000);
        checkBox2.click();

        //6.Confirm	checkbox	#1	is	SELECTED.
        if (checkBox1.isSelected()){
            System.out.println("Checkbox1 is selected. Verification is passed!");
        }else{
            System.out.println("Checkbox1 is not selected. Verification is failed!");
        }


        //7.Confirm	checkbox	#2	is	NOT SELECTED
        if (!checkBox2.isSelected()){
            System.out.println("Checkbox2 is not selected. Verification is passed!");
        }else{
            System.out.println("Checkbox2 is selected. Verification is failed!");
        }



    }
}
