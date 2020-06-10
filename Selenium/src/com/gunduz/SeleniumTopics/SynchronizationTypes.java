package com.gunduz.SeleniumTopics;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SynchronizationTypes {

    // 1. Implicit Wait:
        /*
        The implicit wait will tell to the web driver to wait
            for certain amount of time before it throws a
            "No Such Element Exception".
         The default setting is 0.
        Once we set the time, web driver will wait for
            that time before throwing an exception.
         */
    // EX: driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    // 2. Explicit Wait:

    /*
    The explicit wait is used to tell the Web Driver to wait
        for certain conditions (Expected Conditions)
        or the maximum time exceeded before throwing an
        "ElementNotVisibleException" exception.
     */
    //       WebDriverWait wait = new WebDriverWait(WebDriverReference,TimeOut);
    //  EX:  WebDriverWait wait = new WebDriverWait(driver, 20);


    //       WebElement element      = wait.until(ExpectedConditions.methodName(SeleniumCode...);
    //       WebElement SeleniumLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='test']").click();


    // 3. Thread.sleep(timeouts);
        /*
        Thread.sleep causes the current thread to
            suspend execution for a specified period.
        Throws InterruptedException
         */
    //     Ex: Pause for 4 seconds
    //         Thread.sleep(4000);


    // 4. Fluent Wait:
    /*
    The fluent wait is used to tell the web driver to wait
        for a condition, as well as the frequency
        with which we want to check the condition before
        throwing an "ElementNotVisibleException" exception.

    Frequency: Setting up a repeat cycle with the time frame
        to verify/check the condition at the regular interval of time
     */

    //      Wait wait = new FluentWait(WebDriver reference)
    //                  .withTimeout(Duration.ofSeconds(SECONDS))
    //                  .pollingEvery(Duration.ofSeconds(SECONDS))
    //                  .ignoring(Exception.class);


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);

        WebDriver driver = new ChromeDriver();

        //  IMPLICIT WAIT:
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
       // Thread.sleep(3000);
        addItems(driver, itemsNeeded);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        // EXPLICIT WAIT:
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());



    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            // Convert array to Arraylist
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);


            if (itemsNeededList.contains(formattedName)) {


                //  Click add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
