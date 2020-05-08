package com.gunduz.SeleniumTopics;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


        // Find the count of all links in this page:
        int countOfLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("Total countOfLinks: " + countOfLinks);

        // LIMIT WEBDRIVER SCOPE:

        //  Limit the driver to find links on the footer section
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        int countOfFooterLinks = footerDriver.findElements(By.tagName("a")).size();
        System.out.println("Total countOfFooterLinks: " + countOfFooterLinks);

        // Limit the footerDriver to find links on only first column

        WebElement columnDriver = footerDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));

        int countOfLinksInsideColumn = columnDriver.findElements(By.tagName("a")).size();
        System.out.println("Total countOfLinksInsideFirstColumn: " + countOfLinksInsideColumn);

        //  Click on each link in the first column

        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            //  TO OPEN EACH LINK IN SEPARETE WINDOWS
            String CTRL_Click = Keys.chord(Keys.COMMAND, Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(CTRL_Click);
            Thread.sleep(5000);
        }
        Set<String> switcher = driver.getWindowHandles();
        Iterator<String> iterator = switcher.iterator();
            // SWITCH THE TABS AND GET TITLES
        while (iterator.hasNext()) {

            driver.switchTo().window(iterator.next());
            Thread.sleep(3000);
            System.out.println(driver.getTitle());

        }


    }
}
