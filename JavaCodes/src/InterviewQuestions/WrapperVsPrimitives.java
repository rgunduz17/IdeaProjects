package InterviewQuestions;

import com.sun.codemodel.internal.JNullType;
import com.sun.org.apache.xpath.internal.objects.XNull;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import javax.management.openmbean.InvalidOpenTypeException;

public class WrapperVsPrimitives {

    public static void main(String[] args) {


//    1. Default values:
//    primitives: byte, short, int, long ==> 0;
//                float, double ==> 0;
//                boolean, ==> false;
//                char ==> space;
//    All wrapper class: Null
//    2. Wrapper class only accepts its own primitives values
//    3. Wrapper class have method, primitives do not
//    4. Wrapper class takes object, primitives takes value
//

        int numInt = 10;
        Integer numInteger = 10;

        long longnum = 20L;
        Long numLong = longnum; // auto-boxing: converting primitive values to Wrapper class

        System.out.println(longnum);
        System.out.println(numLong);

        char ch1 = 'L';
        Character ch2 = ch1;  //auto boxing

        char ch3 = ch1;       // none

        char ch4 = ch2;     //unboxing: converting wrapper class to primitive value


    }

}
