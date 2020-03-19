package com.javacodes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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



        String [] NameLists = {"Bli", "Zeli", "Deli","Aeve"};

        Arrays.sort(NameLists);

        System.out.println(Arrays.toString(NameLists));




    }
}
