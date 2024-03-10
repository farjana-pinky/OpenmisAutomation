package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException{

      System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://open-mis-frontend.vercel.app/login");
        driver.manage().window().maximize();


      driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("superadmin");
        Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("superadmin");
        Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@id = '__next']/descendant::button[2]")).click();

      // for dashboard family group form
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[text()= 'Insurees and Policies']")).click();
      driver.findElement(By.xpath("//script[@id ='__NEXT_DATA__']/preceding::a[4]")).click();

      //create family group
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys("Aysha");
      driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys("Rahman");
      driver.findElement(By.xpath("//input[@name = 'other_name']")).sendKeys(" khatun");
      driver.findElement(By.xpath("//input[@type= 'date' and @name= 'birthdate']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type= 'date' and @name= 'birthdate']")).sendKeys("02");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type= 'date' and @name= 'birthdate']")).sendKeys("03");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type= 'date' and @name= 'birthdate']")).sendKeys("2024");

      driver.findElement(By.xpath("//select[@name = 'gender']")).click();
      driver.findElement(By.xpath("//option[text() = 'Female']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'marital_status']")).click();
      driver.findElement(By.xpath("//option[text() = 'Married']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'region']")).click();
      driver.findElement(By.xpath("//option[text() = 'NIGERIA']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'state']")).click();
      driver.findElement(By.xpath("//option[text() = 'BAYELSA']")).click();

      driver.findElement(By.xpath("//select[@name = 'lga']")).click();
      driver.findElement(By.xpath("//option[text() = 'YENOGOA']")).click();

      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'state']")).click();
      driver.findElement(By.xpath("//option[text() = 'BAYELSA']")).click();

      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'ward']")).click();
      driver.findElement(By.xpath("//option[text() = 'ODI']")).click();

      Thread.sleep(1000);
      driver.findElement(By.xpath("//select[@name = 'first_service_point']")).click();
      driver.findElement(By.xpath("//option[text() = 'ODI general Hospital']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name = 'insuree_address']")).sendKeys("shyamoli, dhaka");
      driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("5474578745");
      driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("Aysha78@gmail.com");
      driver.findElement(By.xpath("//input[@name = 'profession']")).sendKeys("SQA");
      driver.findElement(By.xpath("//input[@name = 'education']")).sendKeys("Dhaka colleage");
      driver.findElement(By.xpath("//input[@name = 'identification_no']")).sendKeys("Aysha57574");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name = 'photo_date']")).sendKeys("03");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name = 'photo_date']")).sendKeys("07");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name = 'photo_date']")).sendKeys("2024");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@name = 'photo']")).sendKeys("C:\\Users\\USER\\Pictures\\new data for test\\images (2).jpg");
      Thread.sleep(2000);
      JavascriptExecutor jsc = (JavascriptExecutor)driver;
      jsc.executeScript("window.scrollTo(800,0)");
      //Thread.sleep(1000);
      driver.findElement(By.xpath("//button[contains (text(), 'Save All')]")).click();
      //driver.findElement(By.xpath("//button[contains (text(), 'Reset')]")).click();




      //Thread.sleep(3000);
     /*WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//input[@type= 'date' and @name= 'birthdate']")));*/



    }
}