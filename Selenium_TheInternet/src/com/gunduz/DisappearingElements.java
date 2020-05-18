package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

// Task is not completed check the loop for refresh the page
//   and find the disappearing element
public class DisappearingElements extends Main {


    static String text;

    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Disappearing Elements")).click();
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(5) > a"));

        boolean test = element.isDisplayed();
        if (!test) {
            driver.navigate().refresh();
            Thread.sleep(3000);
        } else {
            text = element.getText();
            driver.quit();
        }

        text = element.getText();
        driver.quit();
    }
        public static void DisappearingElementsMethod () throws InterruptedException {

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

            System.out.println("Disappearing Element Is Found Successfully!!!");
            System.out.println("Title of element is: " + text);


        }

    }

