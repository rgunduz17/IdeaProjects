package test;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class CarObjects {

    public static void main(String[] args) {



        CarClass car1 = new CarClass();
 //   className object = keyword constructorName

        car1.Brand = "BMW";
        car1.Color = "White";
        car1.Mileage = 100000;
        car1.Model = "X6";
        car1.Price = 15000.5;
        car1.Year = 2000;

        System.out.println(car1.Brand);
        System.out.println(car1.Color);
        System.out.println(car1.Mileage);
        System.out.println(car1.Model);
        System.out.println(car1.Price);
        System.out.println(car1.Year);

        System.out.println("===========================");
        CarClass car2 = new CarClass();

        car2.Brand = "Toyota";
        car2.Color = "Black";
        car2.Mileage = 150000;
        car2.Model = "Corolla";
        car2.Price = 2000;
        car2.Year = 2002;

        System.out.println(car2.Brand);
        System.out.println(car2.Color);
        System.out.println(car2.Mileage);
        System.out.println(car2.Model);
        System.out.println(car2.Price);
        System.out.println(car2.Year);



        car1.drive();
        car2.drive();


        car1.start();
        car2.start();

        car1.getInfo();
        car2.getInfo();

        CarClass car3 = new CarClass();


        car3.Brand = "Lexus";
        car3.Color = "Purple";
        car3.Mileage = 25000;
        car3.Model = "RX350";
        car3.Price = 40000;
        car3.Year = 2020;

        System.out.println(car3.Brand);
        System.out.println(car3.Color);
        System.out.println(car3.Mileage);
        System.out.println(car3.Model);
        System.out.println(car3.Price);
        System.out.println(car3.Year);



        car3.drive();
        car3.start();
        car3.getInfo();

    }



}
