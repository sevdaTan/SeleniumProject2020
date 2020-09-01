package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // set up the web driver
        WebDriverManager.chromedriver().setup();

        // create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // test if driver is working
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: " + driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title" + actualTitle);

        //actualUrl.soutv = shortcut
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual url:" + actualUrl);

        driver.navigate().to("https://youtube.com");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().to("https://instagram.com");
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().to("https://homedepot.com");
        Thread.sleep(5000);

           driver.navigate().refresh();
        Thread.sleep(5000);

        driver.navigate().to("https://facebook.com");
        Thread.sleep(5000);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source: "+ pageSource);

        driver.close();

    }

}
