package Gmail;

import java.util.ArrayList;

public class Credentials {


     private String userName= "gunduzridvan35@gmail.com";
     private String passWord = "j.......";
     private String message = "This message has been sent from IntelliJ IDEA by using Java codes";
     private String subject= "Calis calis calis!!!";
     private static String [] Receivers ={"gunduzridvan35@gmail.com"};





    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public static String[] getReceivers() {
        return Receivers;
    }


}
