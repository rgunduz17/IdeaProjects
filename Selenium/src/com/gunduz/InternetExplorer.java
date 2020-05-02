package com.gunduz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// INTERNET EXPLORER DRIVER DOES NOT WORK ON MAC ==> USE MICROSOFT EDGE
public class InternetExplorer{

    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty("webdriver.ie.driver", "//Users//ridvangunduz//IdeaProjects//Selenium");
        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways
        // 3. InternetExplorer: You should download jar files for Internet Explorer by choosing correct
        //   version of Selenium from this link: https://selenium-release.storage.googleapis.com/index.html

        //Creating Driver object for IE Browser
        WebDriver driver =new InternetExplorerDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  Download InternetExplorerDriver from https://selenium-release.storage.googleapis.com/index.html
        //      and add your jar files into your project (file ==> project structure ==> + sign and add your jars there.
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
