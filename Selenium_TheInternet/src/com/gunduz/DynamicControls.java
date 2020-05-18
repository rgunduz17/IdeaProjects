package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DynamicControls extends Main {
   static String message1;
   static String message2;
    static String message3;
    static String message4;

    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Dynamic Controls")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();

        message1 = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
        driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
        message2 = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();

        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("Test Completed!");

        message3= driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        message4= driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();

        driver.quit();


    }

    public static void DynamicControlsMethod () throws InterruptedException {

        // Chrome Browser
        System.setProperty(chromeDriver, ChromeDriverPath);
        WebDriver driver = new ChromeDriver();
        codeBlock(driver);

        // Firefox Browser
        System.setProperty(firefoxDriver, FirefoxDriverPath);
        driver = new FirefoxDriver();
        codeBlock(driver);

        // Microsoft Edge Browser
        System.setProperty(edgeDriver, EdgeDriverPath);
        driver = new EdgeDriver();
        codeBlock(driver);

        // Safari Browser
//        System.setProperty(safariDriver, SafariDriverPath);
//        driver =new SafariDriver();
//        codeBlock(driver);


        System.out.println("Dynamic Controls Are Completed Successfully!!!");
        System.out.println("Message 1: "+ message1);
        System.out.println("Message 2: "+ message2);
        System.out.println("Message 3: "+ message3);
        System.out.println("Message 4: "+ message4);
    }


}
