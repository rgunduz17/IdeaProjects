package javacodes;

public class WrapperClass {

//          every primitive in java has a class thats designed to it.
//          wrapper Class : Byte, Short, Integer, Long, Float, Double, Boolean , Character
//          all wrapper class presented in "java.lang"  package
//          all classes in java lang already imported by default

    public static void main(String[] args) {


        int numInt = 10;
        Integer numInterger =10;

        long longnum =20L;
        Long numLong =longnum; // auto-boxing: converting primitive values to Wrapper class

        System.out.println(longnum);
        System.out.println(numLong);

        char ch1= 'L';
        Character ch2=ch1;  //auto boxing

        char ch3=ch1;       // none

        char ch4 = ch2;     //unboxing: converting wrapper clas to primitive value

//      useful methods of Wrapper Clas:

//      1. MAX_VALUE:


        int maximum = Integer.MAX_VALUE;
        System.out.println(maximum);


        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);

//      2. MIN_VALUE:

        int minimum = Integer.MIN_VALUE;
        System.out.println(minimum);

        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);


//      3. PARSE METHOD

//     A) parseInt("strValue");

        Integer num1 = Integer.parseInt("123");
        System.out.println(num1);


//     B) parseByte("strValue")

        byte num3 = Byte.parseByte("19");
        System.out.println(num3 + 1 );

//     C) parseShort("strValue")


        Short num4 = Short.parseShort("200");
        System.out.println(num4);

//      D) parseLong("strValue")


        Long num5 = Long.parseLong("1222");
        System.out.println(num5);

//      E) parseboolean

        boolean A = Boolean.parseBoolean("CybertekSchool");
        System.out.println(A);

        boolean B = Boolean.parseBoolean("TruE"); // ignore Case sensitivity
        System.out.println(B);

        boolean C = Boolean.parseBoolean("FalSe"); // ignore Case sensitivity
        System.out.println(C);

//      4. VALUE OF METHOD

//      converts String value to Wrapper class value

        int z= Integer.valueOf("12345"); //unboxing

        Integer z1 = Integer.valueOf("1234");

        Integer z2 = (int)Integer.valueOf("121215"+ 3); //auto boxing

        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);


    }








}
