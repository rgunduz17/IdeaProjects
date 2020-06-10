package com.gunduz.TestNG;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interface  implements TestNG listeners
public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Successfully executed Test: "+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed Test: "+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
