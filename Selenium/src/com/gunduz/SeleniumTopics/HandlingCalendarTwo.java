package com.gunduz.SeleniumTopics;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingCalendarTwo {

    public static void main(String[] args) {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");

        // Select a specific date and month
        driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
        // To choose specific month:

        while(!driver.findElement(By.cssSelector("th.datepicker-switch")).getText().contains("December")){
            driver.findElement(By.cssSelector("th.next")).click();
        }


        // To choose specific date:
        List <WebElement> dates  = driver.findElements(By.className("day"));

        int count= driver.findElements(By.className("day")).size();

        for(int i=0; i<count; i++){
            String text= driver.findElements(By.className("day")).get(i).getText();
            if(text.equalsIgnoreCase("23")){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }

    }
}
