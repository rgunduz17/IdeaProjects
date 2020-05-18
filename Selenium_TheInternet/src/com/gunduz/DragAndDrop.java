package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DragAndDrop extends Main{

    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Drag and Drop")).click();
        Thread.sleep(2000);

//        WebElement drag = driver.findElement(By.cssSelector("div#column-b.column"));
//        int x = drag.getLocation().getX();
//        int y = drag.getLocation().getY();
//        System.out.println(x + " " + y);

//      690 87

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.cssSelector("div#column-a.column"));
        WebElement target = driver.findElement(By.cssSelector("div#column-b.column"));
        actions.dragAndDropBy(source,690,87).build().perform();

        actions.clickAndHold(source).pause(2000).moveToElement(target).release().build().perform();

//        Actions action = new Actions(driver);
//        WebElement source = driver.findElement(By.id("column-a"));
//        WebElement target = driver.findElement(By.id("column-b"));
//        action.dragAndDrop(source, target).build().perform();
//        action.moveToElement(driver.findElement(By.id("column-b"))).build().perform();
//        Thread.sleep(2000);
//        driver.quit();



//        Actions builder = new Actions(driver);
//        WebElement source = driver.findElement(By.cssSelector("div#column-a.column"));
//        WebElement target = driver.findElement(By.cssSelector("div#column-b.column"));
//        Action dragAndDrop = builder.clickAndHold(source)
//                .moveToElement(target)
//                .release(target)
//                .build();
//
//        dragAndDrop.perform();
//



    }


    public static void DragAndDropMethod () throws InterruptedException {

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


        System.out.println("Drag And Drop Completed Successfully!!!");



    }

}
