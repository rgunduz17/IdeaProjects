package Framework;

import Utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class TestToFail {

    WebDriver driver;
    @Test
    public void failThisTest(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.Manage(driver);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String pageMessage=  driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        Assert.assertTrue(pageMessage.equalsIgnoreCase("This will be fail"));
        driver.quit();
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {

    // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus())
        {
            try
            {
            // Create reference of TakesScreenshot
                TakesScreenshot ts=(TakesScreenshot)driver;

                // Call method to capture screenshot
                File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
                String pathName ="//Users//ridvangunduz//Desktop//selenium//Screenshots//screenshot.png";

                FileUtils.copyFile(source, new File(pathName));

                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {

                System.out.println("Exception while taking screenshot "+e.getMessage());
            }



        }
// close application
      //  driver.quit();
    }
}
