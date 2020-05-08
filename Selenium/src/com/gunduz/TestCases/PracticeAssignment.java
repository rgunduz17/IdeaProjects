package com.gunduz.TestCases;

import com.gunduz.Browsers.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAssignment {

    public static void main(String[] args) {
        System.setProperty(ChromeBrowser.chromeDriver, ChromeBrowser.DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // Step 1: Click on any checkboxes
        driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();

        // Step 2: Grab the label

        String label= driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
        System.out.println("Label: "+label);

        // Step 3: Select the same label from dropdown

        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(label);


        // Step 4: Enter the label to Editbox

        driver.findElement(By.id("name")).sendKeys(label);

        // Step 5: Click alert button and check the label name is present or not

        driver.findElement(By.id("alertbtn")).click();
        String alert= driver.switchTo().alert().getText();
        System.out.println("Alert Message: "+alert);
        boolean result = alert.contains(label);
        System.out.println("Label is present in alert message: "+result);

    }
}
