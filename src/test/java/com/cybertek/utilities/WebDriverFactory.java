package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

      /*
      Method name = getDriver
      Static method
      Accept string argument : browserType --> will determine what browser opens
      return type = WebDriver
       */

     public static WebDriver getDriver(String browserType){

         if (browserType.equalsIgnoreCase("Chrome")){
             WebDriverManager.chromedriver().setup();
             return new ChromeDriver();
         }
         else if (browserType.equalsIgnoreCase("Firefox")){
          WebDriverManager.firefoxdriver().setup();
          return new FirefoxDriver();
         }
         else {
             System.out.println("Given browser is nor exist. Driver = null!");
             return null;
         }

     }






}
