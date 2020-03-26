package test;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class CarClass {

        // instance variables

    String Model;
    int Year;
    String Brand;
    String Color;
    double Price;
    long Mileage;



    public void drive (){

        System.out.println("Driving "+ Brand);
    }

    public void start(){

        System.out.println("Starting "+ Brand);
    }

    public void getInfo(){

        System.out.println(Year +", "+ Brand +" "+ Model +", "+ Color +", "+Mileage+ " mileage, $"+ Price );

    }
}
