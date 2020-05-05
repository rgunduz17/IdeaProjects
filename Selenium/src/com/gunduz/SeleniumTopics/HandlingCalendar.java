package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class HandlingCalendar {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/"); //URL in the browser

        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
        source.click();

        WebElement source2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
        //  //*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
        source2.sendKeys("MUMBAI");
        Thread.sleep(2000);
        source2.sendKeys(Keys.ARROW_DOWN);
        source2.sendKeys(Keys.ENTER);


        WebElement destination = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
        destination.click();
        destination.sendKeys("DEL");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);


        // Departure Date Choose
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        // Return panel open

        System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]")).getAttribute("class"));
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]")).getAttribute("class"));
        // getAttribute checks the attributes of when return panel open and close
        //    return the changing value for giving attribute

        Thread.sleep(2000);
        //  This assert statement check if return panel opens or not by using attribute keyword  (contains)
        if(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]")).getAttribute("class").contains("activeWidget")){
            System.out.println("It is enabled");
            Assert.assertTrue(true);
        } else{
            System.out.println("It is not enabled");
            Assert.assertFalse(false);
        }

        // Return date choose
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[4]")).click();
        Thread.sleep(2000);

        //  Choose how many traveler
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/button")).click();



        // Click search button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
    }

}

