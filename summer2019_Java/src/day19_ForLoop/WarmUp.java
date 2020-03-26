package day19_ForLoop;

import java.util.Scanner;

public class WarmUp {
	 /*
    Given: username: cybertek.batch12@gmail.com
           password: Javengers
   write a program for the login functionality of the gmail account. (user input is required)
       - username can be entered either in upper or lower case
       - password MUST be entered as it is
       - if the username does not end with "@gmail.com":
                   print "it's not a valid email address"
       - if username ends with gmail but username or password did not match:
                   print "Invalid username or password"
       - if the username and passwords are correct:
                   print "loged in successfully"
    
    */
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enetr your user name");
        String user = scan.nextLine().toLowerCase();
        System.out.println("Enter your password");
        String pass = scan.nextLine();
        
        String username ="cybertek.BatCH12@gmail.com";
        String password ="Javengers";
        
        if(user.endsWith("@gmail.com") ) {
            if(user.equalsIgnoreCase(username) && pass.equals(password) ) {
                System.out.println("Logged in successfully");
            } else {
            	if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
            		System.out.println("both username and passords are incorrects");
            	}else if(!user.equalsIgnoreCase(username)){
            		System.out.println("Invalid Username");
            	}else {
            		System.out.println("Invalid password");
            	}
            }
        } else {
            System.out.println("it's not a valid email address");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
