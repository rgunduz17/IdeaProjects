package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultiWindowTest3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/");

        // Click on Multiple windows
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
        // Click on click here ==> opens child window
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();

        Set<String> ids = driver.getWindowHandles();

        Iterator<String> iterator = ids.iterator();

        String parent = iterator.next();
        String child = iterator.next();

        // New Window ==> prints text
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        Thread.sleep(3000);

        // Opening a new window  ==> prints text
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());


    }
}
