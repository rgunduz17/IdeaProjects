package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultiWindowTest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://accounts.google.com");



        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();

        Set<String> ids = driver.getWindowHandles();

        Iterator<String> it = ids.iterator();

        String parent = it.next();

        String child1 = it.next();

        String child2 = it.next();

      //  System.out.println("Before Switching");
        System.out.println(driver.getTitle());


        Thread.sleep(3000);
        driver.switchTo().window(child1);
       // System.out.println("After Switching");
        System.out.println("Child1: "+driver.getTitle());
        driver.close();

        Thread.sleep(3000);
        driver.switchTo().window(child2);
     //   System.out.println("Second Tab");
        System.out.println("Child2: "+driver.getTitle());
        driver.close();

        Thread.sleep(3000);
        driver.switchTo().window(parent);
       // System.out.println("Back to parent");
        System.out.println("Parent: "+driver.getTitle());
    }

}
