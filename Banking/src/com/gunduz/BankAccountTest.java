package com.gunduz;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass  //This executes before any test cases
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = "+ count++);
    }

    @org.junit.Before // will run this for every methods
    public void setup(){
        account = new BankAccount("Ridvan", "Gunduz", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00,balance,0);
    }
    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00,true);
        assertEquals(400.00,balance,0);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch()  {
        double balance = account.withdraw(600.00,false);
        assertEquals(400.00,balance,0);
        fail("Should have thrown an IllegalArgumentException");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00,account.getBalance(), 0);
    }
    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00,account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        assertTrue("This account is NOT a checking account",account.isChecking());
    }

    @org.junit.AfterClass  //This executes after any test cases
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = "+ count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = "+ count++);
    }

}
