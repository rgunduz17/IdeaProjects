package com.gunduz.SeleniumTopics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();



        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("//Users//ridvangunduz//Desktop//selenium//Screenshots//screenshot.png"));

    }
}
