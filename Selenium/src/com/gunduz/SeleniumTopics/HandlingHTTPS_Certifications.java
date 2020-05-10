package com.gunduz.SeleniumTopics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HandlingHTTPS_Certifications {

    public static void main(String[] args) {


        // SSL Certificates:

//        DesiredCapabilities ch=DesiredCapabilities.chrome();
//        ch.acceptInsecureCerts();
//        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        // DesiredCapabilities Deprecated so use the ChromeOptions:

        //Belongs to local browser:

        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();


    }
}
