package com.cybertek.tests.Project_Bitrix.US2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC9 {
    //AC#9–> User can add Deadline, Time Planning by using date pickers.
    //https://login2.nextbasecrm.com/
    //Username: helpdesk12@cybertekschool.com
    //Password: UserUser

    WebDriver driver;

    @BeforeMethod
    public static void setupMethod() {

        System.setProperty("WebDriverManager.chromedriver", "chromedriver");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk12@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    @Test
    public void us2_ac9() throws InterruptedException {


        //It goes to Task module
       WebElement task = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
       // WebElement task = driver.findElement(By.xpath("//span[.='Task']"));
       // WebElement task = driver.findElement(By.partialLinkText("Tasks"));
       // WebElement task = driver.findElement(By.id("feed-add-post-form-tab-tasks"));
        task.click();
        Thread.sleep(1000);


        //It clicks on The New Task Button
//        WebElement newTaskAdd = driver.findElement(By.id("tasks-buttonAdd"));
//        newTaskAdd.click();
//
//        Thread.sleep(2000);
//
//        //It switch to the task iframe
//        WebElement thingsToDoFrame = driver.findElement(By.xpath("//iframe[@class='side-panel-iframe']"));
//
//        driver.switchTo().frame(thingsToDoFrame);

        //It types the task in the title of the task


//      driver.getWindowHandles();
//
//      try {
//          Thread.sleep(2000);
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("bx-b-link-task-form-lifefeed_task_form")));
//
//        WebElement linkButton = driver.findElement(By.id("bx-b-link-task-form-lifefeed_task_form"));
//        linkButton.click();
//
//        WebElement linkTextField = driver.findElement(By.id("linklifefeed_task_form-href"));
//        linkTextField.sendKeys("https://google.com");
//
//        WebElement linkTextName = driver.findElement(By.id("linklifefeed_task_form-text"));
//        linkTextName.sendKeys("google link");
//
//        WebElement saveButton = driver.findElement(By.id("undefined"));
//        saveButton.click();
//
//        WebElement taskTopic = driver.findElement(By.xpath("//input[@placeholder='Things to do']"));
//        taskTopic.click();
//        taskTopic.sendKeys("test12");
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("blog-submit-button-save")));
//        WebElement sendButton = driver.findElement(By.id("blog-submit-button-save"));
//        sendButton.click();
//
//        WebElement createdTask = driver.findElement(By.xpath("//*[text()='test12']"));
//        createdTask.click();
   }


        @AfterMethod
        public void tearDown () throws InterruptedException {
            Thread.sleep(3000);
            driver.close();
        }


    }



