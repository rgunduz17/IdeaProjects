package com.gunduz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {



    public static void main(String[] args) {
        // Set Property by using driver and path(copy the path where you save the driver for browser)
        System.setProperty("webdriver.safari.driver", "//usr//bin//safaridriver");
        // 1. key value for browsers: "webdriver.(browsername).driver"
        // 2. path: do not forget to put double slash // between pathways

        // 3. Safari’s executable is located at /usr/bin/safaridriver.

        /*
        Configure Safari to Enable WebDriver Support
Safari’s WebDriver support for developers is turned off by default.
How you enable it depends on your operating system.

High Sierra and later:

Run `safaridriver --enable` once. (If you’re upgrading from a previous macOS release,
you may need to use sudo.)

Sierra and earlier:

If you haven’t already done so, make the Develop menu available.
Choose Safari > Preferences, and on the Advanced tab, select “Show Develop menu in menu bar.”
For details, see Safari Help.

Choose Develop > Allow Remote Automation.

Authorize safaridriver to launch the XPC service that hosts the local web server.
To permit this, manually run /usr/bin/safaridriver once and follow the authentication prompt.
         */

        //Creating Driver object for Safari Browser
        WebDriver driver =new SafariDriver();

        // Go to https://www.selenium.dev/downloads/ and find Browsers section at the bottom
        //  More info for SafariDriver https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
