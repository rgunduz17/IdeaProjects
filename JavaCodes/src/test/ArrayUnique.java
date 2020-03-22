package test;

public class ArrayUnique {

    public static void main(String[] args) {


        int [] arr = {1,1,2,2,2,2,2,2,3,4,4,5,6,7};

        for (int j=0; j < arr.length; j++) {
        int count = 0;

             for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
            count++;
        }
    }
             // String unique words/char
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals ( arr[j])) {
//                    count++;
//                }



            if (count ==1 ) {
            System.out.print(arr[j] + " ");

//            if (count !=1 ) {
//                System.out.print(arr[j] + " ");

        }
}

        System.out.println();



    }
}
