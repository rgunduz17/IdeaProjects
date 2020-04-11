package Gmail;

import org.apache.commons.mail.SimpleEmail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SendEmails extends Credentials {


    // https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web

    public static void main(String[] args) {



        Credentials object = new Credentials();
       String userName= object.getUserName();
       String passWord = object.getPassWord();
       String message = object.getMessage();
       String subject= object.getSubject();

       ArrayList<String> receivers = new ArrayList<>(Arrays.asList(getReceivers()));


       //  to sent multiple times
         int times = 3;
        while(times > 0){
        for(String mailList : receivers ) {
            sendEmails(userName, passWord, mailList, message, subject);

            System.out.println("Send successfully");
        }
        times--;
        }
    }

    public static void sendEmails(String userName,String passWord, String Receivers, String message,String subject){

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(userName, passWord);
        email.setSSLOnConnect(true);
        email.setSubject(subject);


        try {
            email.setFrom(userName);
            email.setMsg(message);
            email.addTo(Receivers);
            email.send();
            Thread.sleep(3000);

        } catch (Exception e){  } ;

    }



    }







