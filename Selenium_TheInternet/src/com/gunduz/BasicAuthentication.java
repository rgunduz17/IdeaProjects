package com.gunduz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.util.concurrent.TimeUnit;

public class BasicAuthentication extends Main {
static String pageMessage;
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

    public static void BasicAuthorization() throws InterruptedException {
        // Chrome Browser
        System.setProperty(chromeDriver, ChromeDriverPath);
        WebDriver driver =new ChromeDriver();
        codeBlock(driver);

//        // Firefox Browser
//        System.setProperty(firefoxDriver, FirefoxDriverPath);
//        driver =new FirefoxDriver();
//        codeBlock(driver);
//
//        // Microsoft Edge Browser
//        System.setProperty(edgeDriver, EdgeDriverPath);
//        driver =new EdgeDriver();
//        codeBlock(driver);

        // Safari Browser
        // Basic HTTP Authentication is Unsupported.

//        System.setProperty(safariDriver, SafariDriverPath);
//        driver =new SafariDriver();
//        codeBlock(driver);


        System.out.println("Basic Authentication Is Completed Successfully!!!");
        System.out.println("\t ==> "+ pageMessage);
    }
}
