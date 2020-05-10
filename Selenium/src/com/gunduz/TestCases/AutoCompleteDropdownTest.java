package com.gunduz.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoCompleteDropdownTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
        element.click();
        element.sendKeys("mal");
        Thread.sleep(2000);

        for(int i=1; i<8; i++){
            element.sendKeys(Keys.ARROW_DOWN);
        }

        JavascriptExecutor js= (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text = (String) js.executeScript(script);
        System.out.println(text);

        if(text.equalsIgnoreCase("Malta")){
            System.out.println("Result is correct!");

        }else{
            System.out.println("Result is NOT correct!");
        }
    }
}
