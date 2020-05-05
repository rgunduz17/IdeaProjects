package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsEditBoxesErrorValidation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");

        driver.manage().window().maximize();
        // Pick today's date
        driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a")).click();
        // Select adults
        Select select = new Select(driver.findElement(By.id("Adults")));
        select.selectByIndex(5);
         // Select childrens
        Select select1 = new Select(driver.findElement(By.id("Childrens")));
        select1.selectByVisibleText("3");

        // Click search button
        driver.findElement(By.id("SearchBtn")).click();



        // Print error message
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());


    }


}
