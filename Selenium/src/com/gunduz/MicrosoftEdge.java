package com.gunduz;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty("webdriver.edge.driver", "//Users//ridvangunduz//Desktop//selenium//msedgedriver");
        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways


        //Creating Driver object for MsEdge Browser
        WebDriver driver = new EdgeDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  Download MsEdgeDriver from https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}