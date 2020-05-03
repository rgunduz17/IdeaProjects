package com.gunduz.TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextSiblingParent {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.get("http://www.qaclickacademy.com/interview.php");

        //                           //tagName[text()=' value ']
        driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

        // sibling relationship     after xpath /following-sibling :: tagName
        //      gives next sibling with given tagName
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        // parent relationship      after xpath / parent :: tagName
        //      gives previous parent with given tagName
        System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));


    }
}
