package Framework;


import Resources.ExtentReporterNG;
import Utilities.WebDriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import java.io.IOException;


public class Listener extends WebDriverFactory implements ITestListener {

    ExtentTest test;
	ExtentReports extent= ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Successfully executed Test: "+iTestResult.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {



        WebDriver driver =null;
      String testMethodName =result.getMethod().getMethodName();

        try {
            driver =(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        } catch(Exception e)
        {

        }

        try {
            getScreenShotPath(testMethodName,driver);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void onTestSkipped(ITestResult result) {


    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


    }
    @Override
    public void onStart(ITestContext context) {


    }
    @Override
    public void onFinish(ITestContext context) {


    }

}
