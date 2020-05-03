package com.gunduz.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ContainsAndParentChildRelationShip {


    public static void testSiblingAndParentInXpath(){

        WebDriver driver;
        String driverPath = "//Users//ridvangunduz//Desktop//selenium//geckodriver";
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,
        // Here first we will find a h2 whose text is ''A few of our most popular courses' ,
        // then we move to its parent element which is a 'div' ,
        // inside this div we will find a link whose text is 'SELENIUM'
        // then at last we will find all of the sibling elements of this link('SELENIUM')

//        List<WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
//
//        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
//        for (WebElement webElement : dateBox) {
//            System.out.println(webElement.getText());
//        }

//        List<WebElement> dateBox2 = driver.findElements(By.xpath("//h2[contains(text(),'Check out our newest courses')]/parent::div//div[//a[text()='SAP MM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
//        for (WebElement webElement : dateBox2) {
//            System.out.println(webElement.getText());
//        }
//        driver.close();

       // driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"philadelphia-field-email\"]")).sendKeys("My email address is ...");

        ////*[@id="rt-header"]/div/div[2]/div/ul/li[4]
    }

    public static void main(String[] args) {

        ContainsAndParentChildRelationShip.testSiblingAndParentInXpath();
    }
}
