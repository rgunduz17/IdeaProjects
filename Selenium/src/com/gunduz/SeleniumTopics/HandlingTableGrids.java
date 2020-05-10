package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTableGrids {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/test");
        driver.manage().window().maximize();

        WebElement table= driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div/div[2]/div/div[1]/div"));
       int rowCount=table.findElements(By.cssSelector("#main-content > div > div.l-sticky-side-nav__content > div > div > div.widget.rankings-widget > div > div:nth-child(1) > div > table > tbody > tr:nth-child(1)")).size();
        System.out.println("Number of row:"+rowCount);

        //    First get the row css/xpath and traverse to nth-child(4) to get to total column size
        int count= table.findElements(By.cssSelector("tr.table-body td:nth-child(4)")).size();
        System.out.println("Number of total column: "+count);

        //      Using for loop to print each of items in the column

        int sum=0;
        for(int i=0; i<count; i++){
        String value= table.findElements(By.cssSelector("tr.table-body td:nth-child(4)")).get(i).getText();
        int valueInteger = Integer.parseInt(value); // convert string to integer(int)
         sum +=valueInteger;
        }

        System.out.println(sum);

    }
}
