package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_WebDriverWait {

    public static void main(String[] args) {


        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.manage().window().maximize();
        //  EXPLICIT WAIT ASSIGNMENT:
        driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
        String text= driver.findElement(By.cssSelector("#results")).getText();
        System.out.println(text);




    }
}
