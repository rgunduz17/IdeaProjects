package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("product"));
        int rowCount = table.findElements(By.xpath("//*[@id='product']/tbody/tr")).size();
        System.out.println("Total count of rows: " + rowCount);
        int columnCount = table.findElements(By.xpath("//*[@id='product']/tbody/tr/th")).size();
        System.out.println("Total count of columns: " + columnCount);

        for (int i = 0; i < rowCount; i++) {
            String value = table.findElements(By.xpath("//*[@id='product']/tbody/tr")).get(i).getText();
            if (i == 2) {
                System.out.println("Second row content: " + value);
            }
        }

    }
}
