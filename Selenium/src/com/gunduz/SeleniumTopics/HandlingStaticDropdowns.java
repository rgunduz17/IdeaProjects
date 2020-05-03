package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdowns {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Maximize the browser
        driver.manage().window().maximize();

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

        // selectByValue:  Search the given value and select it
        s.selectByValue("AED");

        // selectByIndex: Use the given index to select item
        s.selectByIndex(3);

        // selectByVisibleText(): Search the given text to find and select it
        s.selectByVisibleText("INR");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        int i =1;
        while(i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(2000L);
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.quit();
        //driver.close();
    }

}
