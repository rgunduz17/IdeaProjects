package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Set;

public class MultiWindowTest4 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        WebDriver driver =new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("https://accounts.google.com");

        String parent= driver.getWindowHandle();

        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
        Thread.sleep(3000);

        Set<String> ids = driver.getWindowHandles();

           ArrayList<String> alltabs= new ArrayList<>(ids);
           System.out.println("Total tab number: "+alltabs.size());

        // Same action for all tabs
//        for(String each: alltabs){
//            driver.switchTo().window(each);
//            System.out.println(driver.getTitle());
//            Thread.sleep(3000);
//            driver.close();
//        }

        driver.switchTo().window(alltabs.get(3));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(alltabs.get(2));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(alltabs.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());


    }

}
