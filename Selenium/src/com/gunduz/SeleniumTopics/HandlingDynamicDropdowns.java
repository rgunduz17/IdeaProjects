package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdowns {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Maximize the browser
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value=\"GOI\"]")).click();
        Thread.sleep(2000L);


     //   driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        //  Xpath with index number:
      //  driver.findElement(By.xpath("(//a[@value=\"STV\"])[2]")).click();

        //  Xpath with parent child relationship
                                     //   parent's xpath (one space) child's xpath
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value=\"STV\"]")).click();

        //  To choose dynamic dropdown

        //  Xpath with index number:  (//tagName[@attribute = 'value']) [choose nth index]
        //        Ex:                 (//a[@value="STV"])[2]



    }
}
