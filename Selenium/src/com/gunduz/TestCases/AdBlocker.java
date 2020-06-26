package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class AdBlocker {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://www.edureka.co");

        driver.findElement(By.linkText("Courses")).click();
        Robot robot = new Robot();
        Thread.sleep(4000);
        

fasdfasdf


    }
}












