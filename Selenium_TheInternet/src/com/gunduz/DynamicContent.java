package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DynamicContent extends  Main{

    static String one;
    static String two;
    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Dynamic Content")).click();
        Thread.sleep(2000);

        for (int i =0; i<3; i++){
            driver.navigate().refresh();
            Thread.sleep(2000);
        }


    }

    public static void edgeBlock(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        //#content > div:nth-child(7) > div.large-10.columns
        //#content > div:nth-child(7) > div.large-10.columns
        one = driver.findElement(By.cssSelector("#content > div:nth-child(7) > div.large-10.columns")).getText();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a")).click();
        Thread.sleep(2000);
        two = driver.findElement(By.cssSelector("#content > div:nth-child(7) > div.large-10.columns")).getText();
    }

    public static void DynamicContentMethod () throws InterruptedException {

        // Chrome Browser
        System.setProperty(chromeDriver, ChromeDriverPath);
        WebDriver driver = new ChromeDriver();
        codeBlock(driver);
        driver.quit();

        // Firefox Browser
        System.setProperty(firefoxDriver, FirefoxDriverPath);
        driver = new FirefoxDriver();
        codeBlock(driver);
        driver.quit();

        // Microsoft Edge Browser
        System.setProperty(edgeDriver, EdgeDriverPath);
        driver = new EdgeDriver();
        codeBlock(driver);
        edgeBlock(driver);
        driver.quit();

        // Safari Browser
//        System.setProperty(safariDriver, SafariDriverPath);
//        driver =new SafariDriver();
//        codeBlock(driver);


        System.out.println("Dynamic Content Is Completed Successfully!!!");
        System.out.println("String one is: "+ one);
        System.out.println("String two is: "+ two);
    }
}
