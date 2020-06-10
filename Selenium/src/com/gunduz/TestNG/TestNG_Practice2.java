package com.gunduz.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Practice2 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before any suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after any suite");
    }

    @Test(groups = {"SmokeTesting"})
    public void thirdDemo(){
        System.out.println("TestNG Third Test");
    }

}
