package com.gunduz.TestCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakeAScreenShotTest {

    String fileWithPath= "//Users//ridvangunduz//Desktop//selenium//Screenshots//test.png";

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        String fileWithPath= "//Users//ridvangunduz//Desktop//selenium//Screenshots//test2.png";

        takeSnapShot(driver, fileWithPath);
    }




    public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file
        File source=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destination=new File(fileWithPath);

        //Copy file at destination
        FileUtils.copyFile(source, destination);

    }

}