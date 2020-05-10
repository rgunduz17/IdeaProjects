package com.gunduz.SeleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazingWindow {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // To maximaze window:
        driver.manage().window().maximize();

        //  fullscreen mode (Removes all sides )
        driver.manage().window().fullscreen();

        // Delete All Cookies:
        driver.manage().deleteAllCookies();

        // Delete Specific Cookie:
        driver.manage().deleteCookieNamed("CookieName");


    }
}
