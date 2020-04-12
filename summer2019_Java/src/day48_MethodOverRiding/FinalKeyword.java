package day48_MethodOverRiding;

class Credentials {
    private final String UserName = "cybertek";
    private final String PassWord = "12321";

    public String getUsername() {
        return UserName;
    } // getter

//	public void setUserName(String UserName) {		//setter
//		this.UserName = UserName;
//	}  final variables can not be reassigned ==> no need to setter
}
class Holly {
    public void printName() {
        System.err.println("Erhan");
    }
}
public class FinalKeyword extends Holly {
    @Override
    public void printName() {
        System.err.println("Madina");
    }

    final int AGE = 100; // Assign value immediately

    public static void main(String[] args) {

        final String SSN = "123456";
//		 			 SSN = "654321";
//		final variables are constant, and cannot be reassigned
        System.out.println(SSN); // 123456

        final String DateOfBirth;
        DateOfBirth = ""; // can assign only one time before USE
        System.out.println(DateOfBirth);

        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.AGE);
    }

    public final void add(int a, int b) {
        System.out.println(a + b);
    }
//			final methods can be overload
    public static double add(double x, double y) {
        return x + y;
    }
}

//		Final Keyword:
//				constant, cannot be changed or modified
//
//		final keyword can only be applied to:

//			variables:  we cannot re-assign it
//						instance variable and static variable MUST be assign IMMEDIATELY
//						local variables need to be assigned before USE
//						if the private data has final, we can ONLY generate getters

//			methods: the implementation of the method cannot be changed
//						 final methods CANNOT be overridden
//						 final methods can be overload

//			classes: final class CANNOT be super class,
//							but can be sub class.
//					 final classes are immutable,
//							they cannot be extended.



