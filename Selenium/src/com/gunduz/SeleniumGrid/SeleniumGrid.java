package com.gunduz.SeleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    public static void main(String[] args) throws MalformedURLException {




        DesiredCapabilities dc= new DesiredCapabilities();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.150:36003/wd/hub"),dc);

        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.MAC);
        driver.get("http://google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());


        dc.setBrowserName("firefox");
        dc.setPlatform(Platform.MAC);

        WebDriver driver1 = new RemoteWebDriver(new URL("http://192.168.0.150:5068/wd/hub"),dc);
        driver1.get("http://google.com");
        driver1.manage().window().maximize();
        System.out.println(driver1.getTitle());

    }
}
