package test;

public class CensorLetters {


    public static String censorLetter(String s, char ch)
    {


        return s.replaceAll(String.valueOf(ch), "*");





    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(censorLetter("computer science",'e')); //"comput*r sci*nc*"
        System.out.println(censorLetter("trick or treat",'t')); //"*rick or *rea*"
    }

}
