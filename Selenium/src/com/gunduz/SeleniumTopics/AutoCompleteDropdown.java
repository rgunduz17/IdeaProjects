package com.gunduz.SeleniumTopics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("myInput"));

       element.click();
       element.sendKeys("ta");
       element.sendKeys(Keys.DOWN);
       element.sendKeys(Keys.DOWN);
     //  element.sendKeys(Keys.DOWN);
       element.sendKeys(Keys.ENTER);

        // Javascript DOM can extract hidden elements
        // Selenium cannot identify hidden elements (Ajax implementation)

        // Javascript Executor:

//        JavascriptExecutor js= (JavascriptExecutor)driver;
//        String script = "return document.getElementById(\"myInput\").value;\n";
//        String text = (String) js.executeScript(script);
//        System.out.println(text); // Tanzania
//
//        while(!text.equalsIgnoreCase("Tanzania")){
//
//            element.sendKeys(Keys.ARROW_DOWN);
//            text = (String) js.executeScript(script);
//            System.out.println(text);
        }






    }
