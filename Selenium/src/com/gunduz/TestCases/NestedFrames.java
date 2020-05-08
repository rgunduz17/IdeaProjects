package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

    public static void main(String[] args) {
        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Nested Frames")).click();

        //     First, switch to bigFrame has 3 small frame in it
        WebElement bigFrame = driver.findElement(By.xpath("/html/frameset/frame[1]"));
        driver.switchTo().frame(bigFrame);

        //      Second switch to small frame
        WebElement smallFrame = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(smallFrame);

        //      Get the text
        WebElement text= driver.findElement(By.cssSelector("div#content"));
        System.out.println(text.getText());

        //      switch to normal mode
        driver.switchTo().defaultContent();
    }
}
