package com.javacodes;



import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        int [] arr= {1,2,3,4};

        System.out.println(arr);


        // 1.convert to String
        //  Arrays.toString(variableName)
        // import java.util.Arrays

        String str = Arrays.toString(arr);
        System.out.println(str);

        String [] names = {"Elif", "Ali", "Veli", "Deli" };

        System.out.println(names );

        System.out.println(Arrays.toString(names));

        // 2. sort method
        // sorts smallest to largest ( or A-Z)

        //Arrays.sort(variableName)

        int [] Numbers = { 9,8,100,3000,4,5,6};

        System.out.println(Arrays.toString(Numbers));

        Arrays.sort(Numbers);

        System.out.println(Arrays.toString(Numbers));

        System.out.println("max is: " + Numbers[Numbers.length-1]);

        System.out.println("min is: " + Numbers[0]);

        // print descending order

        for (int i = Numbers.length -1; i >=0; i--) {
            System.out.print(  Numbers [i] + " ");

        }

        System.out.println();


        String [] NameLists = {"Bli", "Zeli", "Deli","Aeve"};

        Arrays.sort(NameLists);

        System.out.println(Arrays.toString(NameLists));

//      3.  split (str)

        String sentence = "Today is great day Good day to learn Java";

        String [] arr1 = sentence.split(" ");

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

        String email = "FirstName_LastName";
         String [] arr2 = email.split("_");

        System.out.println(Arrays.toString(arr2));

        String str2 = Arrays.toString(arr2);
        System.out.println(str2.replace("[","").replace("]", ""));

//     4. toCharArray()

        String str5= "Java";

        char [] ch = str5.toCharArray();

        System.out.println(Arrays.toString(ch));

        // Second way

        String [] allChars = str5.split("");
        System.out.println(Arrays.toString(allChars));







    }
}
