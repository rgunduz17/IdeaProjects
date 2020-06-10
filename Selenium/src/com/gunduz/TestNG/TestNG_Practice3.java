package com.gunduz.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Practice3 {
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("This will be executed before every methods in Practice3 class");
    }
    @AfterMethod
    public void afterMethods(){
        System.out.println("This will be executed after every methods in Practice3 class");
    }

    @Test(groups = {"SmokeTesting"})
    public void WebLoginCarLoan(){
        System.out.println("Web Login Car Loan");
    }

    @Test(dataProvider = "getData")
    public void LoginCarLoan(String userName, String password){
        System.out.println("Login Car Loan");
        System.out.println(userName);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan"})
    public void LoginAPICarLoan(){
        System.out.println("Login API Car Loan");
    }

    @DataProvider
    public Object[][] getData(){
        // 1. combination: username - password  ==> good credit history
        // 2. combination: username - password  ==> no credit history
        // 3. Fraudulent credit history

        Object [][] data = new Object[3][2];
        data[0][0]="FirstUserName";
        data[0][1]="FirstPassword";

        data[1][0]="SecondUserName";
        data[1][1]="SecondPassword";

        data[2][0]="ThirdUserName";
        data[2][1]="ThirdPassword";

        return data;
    }
}
