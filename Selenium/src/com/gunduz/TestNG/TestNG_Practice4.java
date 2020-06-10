package com.gunduz.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Practice4 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before Practice4 class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after Practice4 class");
    }

    @Test(groups = {"SmokeTesting"})
    public void WebLoginHomeLoan(){
        System.out.println("Web Login Home Loan");
    }


    @Test
    public void MobileLoginHomeLoan(){
        System.out.println("Mobile Login Home Loan");
    }
    @Test
    public void MobileSignInHomeLoan(){
        System.out.println("Mobile Sign In Home Loan");
    }
    @Test
    public void MobileSignOutHomeLoan(){
        System.out.println("Mobile Sign Out Home Loan");
    }

    @Parameters({"URL"})
    @Test
    public void LoginAPIHomeLoan(String urlName){
        System.out.println("Login API Home Loan");
        System.out.println(urlName);
    }
}
