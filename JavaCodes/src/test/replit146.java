package test;

import java.util.*;

public class replit146 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String s = input.next();
    person(s);
}

    public static void person(String s)
    {

        //your code here
        String[] arr= s.split(",");
        String result= "person name: "+ arr[0]+ " last name: "+arr[1]+" age: "+arr[2];
        System.out.println(result);

    }//end person
}
