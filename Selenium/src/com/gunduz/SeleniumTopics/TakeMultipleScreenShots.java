package com.gunduz.SeleniumTopics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TakeMultipleScreenShots {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Create a pathway to save your screenshots(Use // between paths)

        LocalDateTime date = LocalDateTime.now();
        //System.out.println(date.toString());

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("EEEE, MM-dd-yyyy hh:mm:ss a");

        // Your each screenshot will be taken as this format "Month-Date-Year -Hours-Minutes-Seconds AM/PM"
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File("//Users//ridvangunduz//Desktop//selenium//Screenshots//"+sdf.format(date)+".png"));
        //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)

        driver.quit();
    }


}
