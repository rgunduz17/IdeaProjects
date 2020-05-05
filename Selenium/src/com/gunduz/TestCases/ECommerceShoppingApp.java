package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ECommerceShoppingApp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);

        WebDriver driver = new ChromeDriver();

        String [] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        int j=0;
       List <WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));

       for(int i=0; i <products.size(); i++){

          String[] name = products.get(i).getText().split("-");
          String formattedName = name[0].trim();
          // Convert array to Arraylist
           List<String> itemsNeededList = Arrays.asList(itemsNeeded);


          if(itemsNeededList.contains(formattedName)){


              //  Click add to cart
              driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
              if(j == itemsNeeded.length){
                  break;
              }
          }
       }

       Thread.sleep(3000);
       driver.quit();

    }

}
