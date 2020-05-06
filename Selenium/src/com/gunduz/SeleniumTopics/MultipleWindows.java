package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        WebDriver driver =new FirefoxDriver();

        driver.navigate().to("https://accounts.google.com/signup");
        driver.manage().window().maximize();



        driver.findElement(By.cssSelector(".Bgzgmd > li:nth-child(1) > a:nth-child(1)")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        //  Set to ids to handle windows
        Set <String> ids = driver.getWindowHandles();

        // Created iterator to get each windows ids
        Iterator<String> iterator= ids.iterator();
        String parentId =iterator.next();
        String childId =iterator.next();

        // switch to child window
        driver.switchTo().window(childId);
        System.out.println("Child title: "+driver.getTitle());
        driver.close();

        driver.switchTo().window(parentId);
        System.out.println("Parent title: "+driver.getTitle());
        driver.close();
    }
}
