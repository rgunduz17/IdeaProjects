package com.gunduz.SeleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MultipleBrowser {

    static WebDriver driver;
    static Platform MAC;
    static String nodeUrl;
    static String result1;
    static String result2;
    static String result3;
    static String result4;

    public static void setUp(String portNo, String appURL) throws MalformedURLException {
        if (portNo.equalsIgnoreCase("36003")) {
            nodeUrl = "http://192.168.0.150:36003/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.MAC);
            driver = new RemoteWebDriver(new URL(nodeUrl), cap);
            driver.manage().window().maximize();
            driver.navigate().to(appURL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            result1= driver.getTitle();
            driver.quit();


        } else if (portNo.equalsIgnoreCase("5068")) {
            nodeUrl = "http://192.168.0.150:5068/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.MAC);
            driver = new RemoteWebDriver(new URL(nodeUrl), cap);
            driver.manage().window().maximize();
            driver.navigate().to(appURL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            result2= driver.getTitle();
            driver.quit();

        } else if (portNo.equalsIgnoreCase("3264")) {
            nodeUrl = "http://192.168.0.150:3264/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("MicrosoftEdge");
            cap.setPlatform(Platform.MAC);
            driver = new RemoteWebDriver(new URL(nodeUrl), cap);
            driver.manage().window().maximize();
            driver.navigate().to(appURL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            result3= driver.getTitle();
            driver.quit();
        }else if (portNo.equalsIgnoreCase("8806")){
            nodeUrl = "http://192.168.0.150:8806/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("safari");
            cap.setPlatform(Platform.MAC);
            driver = new RemoteWebDriver(new URL(nodeUrl), cap);
            driver.manage().window().maximize();
            driver.navigate().to(appURL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            result4= driver.getTitle();
            driver.quit();

        }



    }


    public static void main(String[] args) throws MalformedURLException {
        setUp("36003","https://tureng.com/en/turkish-english");
        setUp("5068","https://www.facebook.com/");
        setUp("3264", "https://www.youtube.com/");
        setUp("8806", "https://www.guru99.com/");

        System.out.println("Results: \n"+ result1 + " \n" + result2 + " \n"+ result3+ " \n"+ result4);

    }


}
