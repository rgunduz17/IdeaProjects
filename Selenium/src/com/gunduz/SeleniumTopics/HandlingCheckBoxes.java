package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class HandlingCheckBoxes   {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        //  Assert.assertFalse  checks the code, if code has expected result (false) continue to execute
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
        Boolean result1 = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected();
        System.out.println(result1); //  Checked if isSelected();

        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
        Boolean result2 = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected();
        System.out.println(result2); // Checked if isSelected();
        //  Assert.assertTrue  checks the code, if code has expected result(true) continue to execute
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
        // Assert.assertEquals(validation code , "expected result")
        Assert.assertEquals(driver.findElement(By.cssSelector("#familyandfriend > label")).getText(), "Family and Friends");

        driver.quit();
    }

}
