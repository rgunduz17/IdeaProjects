package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CheckBoxes extends Main {

    static int CheckboxCount;
    static String name;

    public static void codeBlock(WebDriver driver){
        driver.get(website);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Checkboxes")).click();

        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected());

        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected());

        CheckboxCount = driver.findElements(By.cssSelector("input[type=checkbox]")).size();

        name = driver.findElement(By.cssSelector("#content > div > h3")).getText();

        driver.quit();
    }

    public static void CheckboxesMethod() throws InterruptedException {

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


        System.out.println(CheckboxCount+" "+ name+" Checked and Unchecked Multiple Times Successfully!!!");

    }



}
