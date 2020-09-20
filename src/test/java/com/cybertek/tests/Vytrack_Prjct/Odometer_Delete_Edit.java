package com.cybertek.tests.Vytrack_Prjct;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Odometer_Delete_Edit {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement username = driver.findElement(By.name("_username"));
        WebElement password = driver.findElement(By.name("_password"));
        WebElement login = driver.findElement(By.id("_submit"));

        username.sendKeys("user162");
        Thread.sleep(2000);
        password.sendKeys("UserUser123");
        Thread.sleep(2000);
        login.click();
        Thread.sleep(1000);

        WebElement FleetModule = driver.findElement(By.className("dropdown-level-1"));
        FleetModule.click();
        Thread.sleep(2000);

        WebElement VehicleOdometer = driver.findElement(By.linkText("Vehicle Odometer"));
        VehicleOdometer.click();
        Thread.sleep(1000);

        List<WebElement> rowValues = driver.findElements(new By.ByLinkText("..."));
        Actions actions = new Actions(driver);
        actions.moveToElement(rowValues.get(0)).perform();
        List<WebElement> dots = driver.findElements(new By.ByXPath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr/td[7]/div[1]/div/a"));
        actions.moveToElement(dots.get(0)).perform();
        Thread.sleep(3000);
        List<WebElement> views = driver.findElements(new By.ByXPath("//a[@title=\"View\"]"));
        actions.moveToElement(views.get(0)).perform();
        views.get(0).click();
        String actualLink = driver.getCurrentUrl();
        String expectedLink = "https://qa2.vytrack.com/entity/view/Extend_Entity_VehiclesOdometer/item/1989?grid[custom-entity-grid]=i%3D1%26p%3D25%26c%3Did0.OdometerValue1.Date1.Driver1.Units1.Model1%26v%3D__all__%26a%3Dgrid%26g%255Bclass_name%255D%3DExtend%255CEntity%255CVehiclesOdometer";
        if (actualLink.equals(expectedLink)) {
            System.out.println("User is able to click on View module");
        }
        Thread.sleep(3000);
        driver.navigate().back();

//        List <WebElement> ThreeDotsList = driver.findElements(new By.ByClassName("action-cell grid-cell grid-body-cell"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(ThreeDotsList.get(0)).perform();
//       // System.out.println(ThreeDotsList.size());
//
//       // WebElement EditDeleteButton = driver.findElement(By.xpath("//a[.='...'][1]"));
//        //EditDeleteButton.click();
//       // EditDeleteButton.click();
//        Thread.sleep(1000);
//try {
//    WebElement EditButton = driver.findElement(By.xpath("//a[@title='Edit'][0]"));
//
//    EditButton.click();
//    Thread.sleep(2000);
//}catch(NoSuchElementException e){
//    System.out.println("No such element");
//}
//
//        driver.navigate().back();
//
//        Thread.sleep(3000);
//
////        driver.findElement(By.xpath("//a[.='...'][1]")).click();
////        driver.findElement(By.xpath("//a[.='...'][1]")).click();
//
//       // Thread.sleep(3000);
//
////        driver.findElement(By.xpath("//ul[@class='nav nav-pills icons-holder launchers-list'][1]/li[3]")).click();
////        Thread.sleep(3000);
//
//      //  driver.findElement(By.xpath("//a[.='Cancel']")).click();
//
//        driver.quit();
        driver.close();

    }
}





