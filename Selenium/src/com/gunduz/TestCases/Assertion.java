package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertion {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Assignment 1:
        //  Check the first Checkbox and verify if it is successfully checked
        //      and Uncheck it again to verify if it is successfully Unchecked


        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
        Boolean result1 = driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected();
        System.out.println("Checkbox is selected: "+ result1);

        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
        Boolean result2 = driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected();
        System.out.println("Checkbox is selected: "+ result2 + " ==> Unselected confirmed.");

        // Assignment 2:
        // How to get the Count of number of check boxes present in the page

        int Count = driver.findElements(By.cssSelector("input[type=checkbox")).size();
        System.out.println("Total number of checkboxes are: "+ Count);


    }
}
