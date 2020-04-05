package day30_WrapperClass_ArrayList;



public class WrapperTest {

    public static void main(String args[]){

//        1. MAX_VALUE:
//		 returns the maximum value of the primitive
        int maximum = Integer.MAX_VALUE;
        System.out.println(maximum); // 2147483647

        double maximumDouble = Double.MAX_VALUE;
        System.out.println(maximumDouble); // 1.7976931348623157E308

        byte maximumByte = Byte.MAX_VALUE;
        System.out.println(maximumByte); // 127

        char maximumChar = Character.MAX_VALUE;
        System.out.println(maximumChar); // ￿

//     2. MIN_VALUE:
//      returns min value of primitive

        int minimum = Integer.MIN_VALUE;
        System.out.println(minimum); // -2147483648

        byte minimumByte = Byte.MIN_VALUE;
        System.out.println(minimumByte); // -128

//        3. ValueOf methods:
//		        converts String value to Wrapper class values,
//		        returns wrapper

        int z = Integer.valueOf("123");
        System.out.println(z); // 123

        Integer z1 = Integer.valueOf("12345");
        System.out.println(z1); // 12345

        Integer z2 = (int)Integer.valueOf("12345"+67);
        System.out.println(z2); // 1234567

        boolean result1 = ! Boolean.valueOf("FALSE");
        System.out.println(result1); // true
//         ValueOf methods ignores the case sensitivity


//       4.  parse methods:
//         converts String values to primitives,
//         returns the value as primitive.


//       A)  parseInt("strValue"):
//         takes the String and converts the String to int primitive

        Integer num1 = Integer.parseInt("123"); // Auto-Boxing
        System.out.println(num1);  // 123

        int num2 = Integer.parseInt("125");     // none
        System.out.println(num2+1);  //126


//        B) parseByte("strValue"):
//             takes the String and converts String to byte

        byte num3 = Byte.parseByte("18");    // none
        System.out.println(num3+1); // 19

        Byte num4 = Byte.parseByte("18");   // Auto-Boxing
        System.out.println( num4+1 );  // 19



//        C) parseShort("StrValue"):
//            takes the String and converts it to Short primitive value

        short num5 = Short.parseShort("200"); // none
        System.out.println( num5+1 ); // 201

        Short num6 = Short.parseShort("200"); // Auto-Boxing
        System.out.println(num6+1);  // 201


//       D)  parseLong("strValue"):
//         takes String value and converts to long primitive

        long num7 = (int)Long.parseLong("1222");
        long num8 = Long.parseLong("1222");
        System.out.println( num7 ); // 1222
        System.out.println( num8 ); // 1222


//       E)  parseFloat("strValue"):
//         takes String value and converts it to float primitive

        float num9 = Float.parseFloat("12.5");      // none
        System.out.println( num9+1 ); // 13.5

        Float num10 = Float.parseFloat("12.5");     // Auto-Boxing
        System.out.println( num10+1 ); // 13.5


//       F.  parseDouble("strValue"):
//         takes String value and converts it to double primitive

        double num12 = Double.parseDouble("8.5"); // none
        System.out.println( num12+1 );  // 9.5

        Double num13 = Double.parseDouble("8.5"); // Auto-Boxing
        System.out.println( num12+1 );  // 9.5

//        G)  parseBoolean("strValue):
//         takes String and converts to boolean primitive

        boolean A = Boolean.parseBoolean("CybertekBatch18");
//         any String values other than true will return false
        System.out.println(A); // false

        boolean B = Boolean.parseBoolean("TrUe");
//         method ignores the case sensitivity
        System.out.println(B); // true


        boolean C = Boolean.parseBoolean("10 > 9"); // "10 > 9" != "true"
        System.out.println(C);


        Boolean D = Boolean.parseBoolean("TrUe");
        System.out.println(D);







    }

}
