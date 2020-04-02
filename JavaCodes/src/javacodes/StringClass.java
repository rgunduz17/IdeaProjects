package javacodes;



public class StringClass {
    public static void main(String[] args) {


        //create an object
        String s1 = "cat";
        System.out.println("String s1 "+s1);

     // Second way with new keyword;
        String s2 = new String("dog");
        System.out.println("String s2 "+s2);


        System.out.println("*****************************************");

        //String Methods;

        // 1.  charAt(index):


        String str = "Cybertek";
        int n=3;
        System.out.println("#"+n+ " char for "+ str + " is: "+str.charAt(n));
        System.out.println(""+str.charAt(3)+str.charAt(4));

        System.out.println("*****************************************");

        // 2. length();

        String name = "Donald J Trump";
        System.out.println("There are "+name.length() + " chars at String: " + name);


        System.out.println("*****************************************");

        // 3. concat(str);

        String a1= "Cybertek";

        System.out.println(a1.concat(" Okul"));

        a1= a1.concat(" School");  // assign a variable first
        System.out.println("Concat of " + a1  );



        System.out.println("*****************************************");


        // 4. toUpperCase()

        String a2= "cybertek";
        System.out.println(a2+ " toUpperCase(): " + a2.toUpperCase());

        // 5. toLowerCase()

        String a3 = "CYBERTEK";
        System.out.println(a3+ " toLowerCase(): " +a3.toLowerCase());

        String a4= "RIDVAN";

        a4= a4.toLowerCase();
        System.out.println("toLowerCase(): "+a4);

        System.out.println("*****************************************");

        // 6. trim()
        // remove unused spaces

            String a5= "       Hello";
            a5 = a5.trim();

        System.out.println("Spaces are trimmed "+a5);


        System.out.println("*****************************************");

        // 7. substring(beginning index)

        String a6= "CyberTek School";

        String a7= a6.substring(9);
        System.out.println("Substring of "+ a6+ " is :  "+a7);

//          substring (beginning index, last index)

        String a8 = "Hello Cybertek School";
        a8 = a8.substring(6,14);
        System.out.println(a8);

        System.out.println("*****************************************");

        // 8. replace(old char, new char)



        String a9 = "Java is Fun Programming Language";
        // a9. replace('a', 'e');

        a9= a9. replace('a', 'e');

        System.out.println("Replaced all \"A\"s with \"E\"s : "  + a9);



        //  replace (old str, new str)

        String str3 = "Today is gonna be great day to learn JAVA";
       str3 = str3.replace("Today", "Tomorrow");
        System.out.println("Replaced \"Today\" with \"Tomorrow\": " + str3);

        //  replaceFirst(old str, new str)

        String str4 = "Java is fun, Java is good.";

        str4 = str4.replaceFirst("Java", "Phyton");
        System.out.println("Replaced first \"Java\" word with \"Phyton\" : "+str4);

        //  replaceAll(old str, new str)


        String str5 = "how to do in java provides java tutorials";

          String newStr = str5.replaceAll("java", "Pyhton");

          System.out.println("Replaced All \"java\" words with \"Phyton\": " + newStr);

         System.out.println("*****************************************");


         // 9. indexOf (str)

        String a10= "Batch 18 is a great group";

        // a10.indexOf("g");|

        int num1 = a10.indexOf("g");

        System.out.println( "index number of \"g\" is: " + a10.indexOf("g"));
        System.out.println( "index number of \"g\" is: " + num1);



        String email= "Randomemail@gmail.com";

        String emailType = email.substring(email.indexOf("@")+1,email.indexOf(".") );

        System.out.println("Email type is : "+emailType);


        System.out.println("*****************************************");

        //  10.  lastIndexOf()

        String a11= "VABCDEFGHIJKLMNOPRSTUVYZ";

        int num3= a11.indexOf("V");
        int num4 = a11.lastIndexOf("V");

        System.out.println("First indexOf \"V\" is : "+num3);
        System.out.println("Last indexOf \"V\" is : "+num4);


        System.out.println("*****************************************");

//      11. isEmpty()

        String a12= "Cybertek";
        boolean test1= a12.isEmpty();
        System.out.println(test1);

        String a13 = "";

        a13 = (a13.isEmpty()) ? "its empty String" : "it not empty";
        System.out.println(a13);

        System.out.println("*****************************************");

//      12. equals()

        String a14 = "Cybertek";

        String a15= new String("Cybertek");

        System.out.println(a14 == a15);
        boolean a16 = a14.equals(a15);
        System.out.println("a14 equals to a15 is: "+a16);
        
        System.out.println("*****************************************");


//      13. contains (str)

        //return boolean expression

        String a17 = "Ridvan";
        //name.contains ("Good man");

        boolean test2 = name.contains ("Good man");
        System.out.println("Contains: " + test2);


       System.out.println("*****************************************");



//      14. startsWith(str)
//      boolean expression

        String today = "Java";
        boolean test3 = today.startsWith("J");

        System.out.println(today+ " starts with J is : " + test3);

        System.out.println("*****************************************");


//      15. endsWith(str)
//        boolean expression

        String tomorrow = "Friday";
        boolean test4 = tomorrow.endsWith("y");
        System.out.println(tomorrow+ " ends with y is: " +test4);

        System.out.println("*****************************************");

        System.out.println();

    }
}