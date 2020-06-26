package com.gunduz.SeleniumTopics;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjax_MouseInteractions {

    public static void main(String[] args) {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement move = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));

        //  Navigate to mouse over Sign in Section and tabs open
        Actions a = new Actions(driver);
      //  a.moveToElement(move).contextClick().build().perform();

//        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[8]/span"))).build().perform();
//        driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[8]/span")).click();

        //  keyDown(Keys.AnyButton)  ===> it holds the keys (like holding shift to write capital letters)
        //  doubleClick();  ===>  double click with mouse
        //  contextClick()  ===>  right click with mouse

      a.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click()
                     .keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


    }
}
