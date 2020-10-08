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

   static WebDriver driver;

    @BeforeMethod
    public static void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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

        Thread.sleep(2000);

        //It goes to Task module
       WebElement task = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        // WebElement task = driver.findElement(By.xpath("//span[.='Task']"));
        // WebElement task = driver.findElement(By.partialLinkText("Tasks"));
        // WebElement task = driver.findElement(By.id("feed-add-post-form-tab-tasks"));
        task.click();
        Thread.sleep(2000);


        //It clicks on The Deadline Box

        WebElement deadline = driver.findElement(By.xpath("//input[@class='task-options-inp']"));
        deadline.click();

        // choose a month
        WebElement chooseMonth = driver.findElement(By.xpath("//a[@class='bx-calendar-top-month']"));
        chooseMonth.click();

        Thread.sleep(1000);
        WebElement month = driver.findElement(By.xpath("//span[@class='bx-calendar-month bx-calendar-month-active']"));
        month.click();

        Thread.sleep(1000);

        // choose a day
        WebElement chooseDay = driver.findElement(By.xpath("//a[@data-date='1603065600000']"));
        chooseDay.click();
        Thread.sleep(1000);

        // choose time
       //WebElement chooseHour = driver.findElement(By.xpath("//input[@class='bx-calendar-form-input']"));
        WebElement chooseHour = driver.findElement(By.xpath("//a[@data-dir='-1']"));
        chooseHour.click();
        chooseHour.click();
        chooseHour.click();
        chooseHour.click();
        Thread.sleep(1000);

        // choose Select
        WebElement chooseSelect = driver.findElement(By.linkText("Select"));
        chooseSelect.click();
        Thread.sleep(1000);

        // choose time planning
        WebElement timePlanning = driver.findElement(By.xpath("//span[@data-target='date-plan']"));
        timePlanning.click();
        Thread.sleep(1000);

        // click start task on
        WebElement startTaskOn = driver.findElement(By.xpath("//span[@data-bx-id='dateplanmanager-start-date-plan']"));
        startTaskOn.click();
        Thread.sleep(1000);


        WebElement calender = driver.findElement(By.xpath("//div[@class='bx-calendar-button-block']"));
        calender.click();
        Thread.sleep(1000);

        //choose TimePlanning day
        WebElement choosePlanningDay = driver.findElement(By.xpath("//a[@data-date='1603065600000']"));
        choosePlanningDay.click();
        Thread.sleep(1000);

        // choose Select
        WebElement chooseSelect2 = driver.findElement(By.linkText("Select"));
        chooseSelect2.click();
        Thread.sleep(1000);

       // choose duration
        WebElement duration = driver.findElement(By.xpath("//input[@data-bx-id='dateplanmanager-duration']"));
        duration.click();
        Thread.sleep(1000);
        duration.sendKeys("1");

        // choose finishDate
        WebElement finishDate = driver.findElement(By.xpath("//input[@data-bx-id='datepicker-display']"));
        finishDate.click();
        Thread.sleep(1000);

        // choose close
        WebElement chooseClose = driver.findElement(By.linkText("Close"));
        chooseSelect2.click();
        Thread.sleep(1000);

    }


        @AfterMethod
        public void tearDown () throws InterruptedException {
            Thread.sleep(3000);
            driver.close();
        }


    }


