package com.gunduz.SeleniumTopics;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

    public static void main(String[] args) {
        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        // Switch to frame by index number
        //driver.switchTo().frame(0);

        // Switch to frame by WebElement
        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
        driver.findElement(By.id("draggable")).click();

        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();


        // goes back to defaultContent and perform normal operations
        driver.switchTo().defaultContent();

    }
}
