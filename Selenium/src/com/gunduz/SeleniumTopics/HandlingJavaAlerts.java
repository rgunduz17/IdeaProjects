package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
        driver.manage().window().maximize();

        String name= "Ridvan";
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();

        // print alert message to console
        System.out.println(driver.switchTo().alert().getText());
        // to accept a pop up alert
        driver.switchTo().alert().accept();


        String name2="Abuzittin";
        driver.findElement(By.id("name")).sendKeys(name2);
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);

        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();




       // driver.quit();
    }
}
