package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableColumns {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
      //  driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

       List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));

        ArrayList<String> originalList= new ArrayList<>();
        for(int i=0; i<firstColList.size(); i++){
           originalList.add( firstColList.get(i).getText()  );
        }




        ArrayList <String> copiedList = new ArrayList<>();
        for (int i=0; i<originalList.size(); i++){
            copiedList.add(originalList.get(i));
        }

        System.out.println("originalList: "+originalList);
        Collections.sort(copiedList); // ascending order
        System.out.println("copiedList: "+copiedList);
        Collections.reverse(copiedList); // descending order

        for(String each : copiedList){
            System.out.print(each+" ");
        }

        Assert.assertTrue(originalList.equals(copiedList));

    }
}
