package com.gunduz.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static String chromeDriver = "webdriver.chrome.driver";
    public static String DriverPath ="//Users//ridvangunduz//Desktop//selenium//chromedriver";


    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty(chromeDriver, DriverPath);
      //  System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways


        //Creating Driver object for Chrome Browser
        WebDriver driver =new ChromeDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  Download ChromeDriver from https://sites.google.com/a/chromium.org/chromedriver/downloads

        driver.get("http://google.com");  // Goes to given url


        System.out.println(driver.getTitle()); // gets website page title

        System.out.println(driver.getCurrentUrl());  // validate web address

    //    System.out.println(driver.getPageSource());  // give page source ==> html/css/js codes

        driver.navigate().to("http://yahoo.com"); // navigate to link

    //    driver.navigate().back();   // goes to another link and goes back

    //    driver.navigate().forward();  // goes to next link

            driver.close();  // close the browser after test

    //        driver.quit();   // it closes all the browsers opened by Selenium script

    }
}
