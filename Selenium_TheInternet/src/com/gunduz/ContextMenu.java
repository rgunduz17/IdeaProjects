package com.gunduz;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContextMenu extends Main {

    /*
    Context Menu
Context menu items are custom additions that appear in the right-click menu.

Right-click in the box below to see one called 'the-internet'.
When you click it, it will trigger a JavaScript alert.
     */
    static String alertMessage;

    public static void codeBlock(WebDriver driver) throws InterruptedException {
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Context Menu")).click();

        WebElement move = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
        Actions action = new Actions(driver);

        action.moveToElement(move).contextClick().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alertMessage = alert.getText();
        Thread.sleep(1000);
        alert.dismiss();

        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.quit();
    }

    public static void ContextMenuMethod() throws InterruptedException {

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

        System.out.println("Successfully Right Clicked To Context Menu and Accepted JavaScript Alert");
        System.out.println("Alert message is: "+ alertMessage);

    }
}
