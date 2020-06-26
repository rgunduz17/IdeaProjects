package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExampleTest extends TestBase {

    // 1. DO NOT FORGET TO WRITE "extends TestBase" FOR EACH CLASS YOU HAVE CREATED
    //          (!!!FOR TEST CASE CLASSES ONLY!!!)

    // 2. YOU DO NOT NEED TO DEFINE WEBDRIVER
    //    DO NOT NEED TO USE WEBDRIVERFACTORY
    //    JUST USE driver.... and write your code.


    // 3. DEFAULT BROWSER IS CHROME IF YOU WANT TO CHANGE IT,
    //      GO TO configuration.properties and change it there

    // 4. BEFORE AND AFTER METHODS CREATED ALREADY, PLEASE CHECK THEM TO AVOID TEST FAILURE

    // 5. AFTER EACH TEST RUN, FRAMEWORK WILL CREATE A EXTENT REPORT AUTOMATICALLY,
    //      THIS FILE IS LOCATED IN test-output FOLDER AND NAMED report.html
    //      THIS FILE IN HTML FORMAT. TO SEE IT COPY THE PATH AND PASTE IN YOUR BROWSER


    // 6. AFTER EACH FAILED TEST RUN, FRAMEWORK WILL CREATE A SCREENSHOT
    //          WITH NAME OF THE FAILED METHOD AND DATE NEAR IT
    //    THIS FILE IS LOCATED IN test-output FOLDER

    //      SUPER IMPORTANT!!!!!!!!!!!
    //  7. RENAME YOUR TESTCASE CLASS NAME AND USE "TEST" KEYWORD WHILE NAMING THEM
    //  EX:   LoginTest    LogoutTest   VerificationTest    OrderTest     etc...





    @Test
    public void verifyNavigateToVehiclePage(){

        // name of the test
        extentLogger = report.createTest("Verify Navigate To Vehicle Page");
        // info ()  --> to print a message
        extentLogger.info("entering user credentials");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        extentLogger.info("click login");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

}
