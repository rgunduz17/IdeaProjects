package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account("12345" , 0.00 , "Bob the Job" , "myemailaddress.com", "myemailaddress.com" );

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob the Job");
        bobsAccount.setCustomerEmailAddress("myemailaddress.com");
        bobsAccount.setCustomerPhoneNumber("myemailaddress.com");





        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);



    }
}
