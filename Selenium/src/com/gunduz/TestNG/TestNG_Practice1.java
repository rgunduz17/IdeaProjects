package com.gunduz.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Practice1 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute first before defined test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This will execute last after defined test");
    }

    @Test(groups = {"SmokeTesting"})
    public void Demo(){
        System.out.println("TestNG First Test");
    }


    @Parameters({"URL","APIKey/username"})
    @Test
    public void secondDemo(String urlName,String key){
        System.out.println("TestNg Second Test");
        System.out.println(urlName);
        System.out.println(key);
    }
}
