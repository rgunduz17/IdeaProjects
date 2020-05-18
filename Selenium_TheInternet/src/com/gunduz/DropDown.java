package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown extends Main{

    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Dropdown")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();

        Select select =new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
        select.selectByIndex(2);

        driver.quit();


    }

    public static void DropDownMethod () throws InterruptedException {

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


        System.out.println("Dropdown Options Selected Successfully!!!");



    }

}
