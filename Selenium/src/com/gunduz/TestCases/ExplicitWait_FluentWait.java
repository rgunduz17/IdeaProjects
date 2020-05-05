package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class ExplicitWait_FluentWait {

    public static void main(String[] args) {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();


        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {

                if(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed()){

                return driver.findElement(By.cssSelector("#finish > h4"));
                }else{
                    return null;
                }
            }
        });

        System.out.println(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("#finish > h4")).getText());
        // Lambda
        // WebElement element = wait.until(driver1 -> driver1.findElement(By.cssSelector("#finish > h4")));
    }
}
