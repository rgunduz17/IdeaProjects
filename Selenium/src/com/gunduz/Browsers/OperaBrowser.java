package com.gunduz.Browsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.opera.OperaDriver;
// DOWNLOAD OPERA BROWSER AND TEST THE CODE AGAIN
public class OperaBrowser {

    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty("webdriver.opera.driver", "//Users//ridvangunduz//Desktop//selenium//operadriver_mac64");
        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways


        //Creating Driver object for Opera Browser
        WebDriver driver =new OperaDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  Download OperaDriver from https://github.com/operasoftware/operachromiumdriver/releases

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
