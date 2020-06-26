package com.gunduz.SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicAuthentication {
    static String pageMessage;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();

        codeBlock(driver);

        System.out.println("Basic Authentication Is Completed Successfully!!!");
        System.out.println("\t ==> "+ pageMessage);
    }

    public static void codeBlock(WebDriver driver) throws InterruptedException {

        // to authenticate username and password
        // http://username:password@test.com

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pageMessage = driver.findElement(By.cssSelector("p")).getText();
        Thread.sleep(2000);


        driver.quit();

    }
}
