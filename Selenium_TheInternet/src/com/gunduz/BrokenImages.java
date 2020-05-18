package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class BrokenImages extends Main {
static WebElement image;
static ArrayList<String > list=new ArrayList<>();

    public static void codeBlock(WebDriver driver){

        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Broken Images")).click();

        for (WebElement image : driver.findElements(By.cssSelector("img")))
        {


            if (image.getAttribute("naturalWidth").equals("0"))
            {
                String broken = image.getAttribute("outerHTML") + " is broken.";
                if(!list.contains(broken)) {
                    list.add(broken);
                }

            }

        }

        driver.quit();

    }


    public static void BrokenImagesMethod() throws InterruptedException {

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
        System.setProperty(safariDriver, SafariDriverPath);
        driver =new SafariDriver();
        codeBlock(driver);


        System.out.println("Broken Images Found and Reported Successfully!!!");
        System.out.print("Broken Images: ");
        for(String each: list)
        System.out.print(each+ " ");
        }

    }


