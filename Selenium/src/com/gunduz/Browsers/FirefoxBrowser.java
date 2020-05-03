package com.gunduz.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty("webdriver.gecko.driver", "//Users//ridvangunduz//Desktop//selenium//geckodriver");
        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways

        //Creating Driver object for Firefox Browser
        WebDriver driver =new FirefoxDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  Download FirefoxDriver from https://github.com/mozilla/geckodriver/releases

        driver.get("http://google.com");
        System.out.println(driver.getTitle()); // gives page title: Google
    }
}
