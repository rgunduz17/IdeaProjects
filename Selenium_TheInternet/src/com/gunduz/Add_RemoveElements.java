package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Add_RemoveElements extends Main{

    // Note: Update these codes when you learn to test cross browsers with TestNG

    public static void codeBlock(WebDriver driver) throws InterruptedException {

        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        for(int i=0; i<18; i++) {
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
            Thread.sleep(200);
        }
        for(int i=0; i<18; i++) {
            driver.findElement(By.xpath("//*[@id=\"elements\"]/button[1]")).click();
            Thread.sleep(200);
        }
        driver.quit();
    }

    public static void AddRemoveElements() throws InterruptedException {

        // Chrome Browser
        System.setProperty(chromeDriver, ChromeDriverPath);
        WebDriver driver =new ChromeDriver();
        codeBlock(driver);

        // Firefox Browser
        System.setProperty(firefoxDriver, FirefoxDriverPath);
        driver =new FirefoxDriver();
        codeBlock(driver);

        // Microsoft Edge Browser
        System.setProperty(edgeDriver, EdgeDriverPath);
        driver =new EdgeDriver();
        codeBlock(driver);

        // Safari Browser
//        System.setProperty(safariDriver, SafariDriverPath);
//        driver =new SafariDriver();
//        codeBlock(driver);


        System.out.println("Add/Remove Elements Are Completed Successfully!!!");
        System.out.println("\t ==> 18 new elements have been added and removed.");
    }
}
