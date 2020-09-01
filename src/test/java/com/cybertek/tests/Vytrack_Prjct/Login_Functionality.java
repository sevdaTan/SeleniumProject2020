package com.cybertek.tests.Vytrack_Prjct;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Functionality {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");


        WebElement username = driver.findElement(By.name("_username"));
        WebElement password = driver.findElement(By.name("_password"));
        WebElement login = driver.findElement(By.id("_submit"));

        username.sendKeys("user162");
        Thread.sleep(2000);
        password.sendKeys("UserUser123");
        Thread.sleep(2000);
        login.click();
        Thread.sleep(4000);

        driver.findElement(By.id("user-menu")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Logout")).click();

//        String actualURL = driver.getCurrentUrl();
//        String expectedURL = "https://qa2.vytrack.com/user/login";
//
//        if (expectedURL.equals(actualURL)) {
//            System.out.println("Login Functionality: Passed!");
//        } else {
//            System.out.println("Login Functionality: Failed!");
//        }
        Thread.sleep(5000);

        driver.close();
//src/test/java/com/cybertek/tests/Vytrack_Prjct/Login_Functionality.java
    }
}