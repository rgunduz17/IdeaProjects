package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class MultiWindowTest2 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        WebDriver driver =new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("https://accounts.google.com");



        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
        Thread.sleep(3000);

      //  Set<String> ids = driver.getWindowHandles();

        ArrayList<String> ids = new ArrayList<>(driver.getWindowHandles());

        Iterator<String> it = ids.iterator();

        String parent = it.next();

        String child1 = it.next();

        String child2 = it.next();

        String child3= it.next();


        System.out.println("Parent: "+driver.getTitle());


        Thread.sleep(3000);
     //   driver.switchTo().window(child3);
        driver.switchTo().window(ids.get(3));
        System.out.println("Child1: "+driver.getTitle());
        driver.close();

//        Thread.sleep(3000);
//        driver.switchTo().window(child2);
//        System.out.println("Child2: "+driver.getTitle());
//        driver.close();
//
//        Thread.sleep(3000);
//        driver.switchTo().window(child1);
//        System.out.println("Child3: "+driver.getTitle());
//        driver.close();
//
//        Thread.sleep(3000);
//        driver.switchTo().window(parent);
//        System.out.println("Parent: "+driver.getTitle());
    }

}
