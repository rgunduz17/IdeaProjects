package day48_MethodOverRiding;
class TestOverride2 {
    private final String UserName = "cybertek";
    private final String PassWord = "12321";
    // instance variable MUST be assign value immediately
    public String getUsername() {
        return UserName;
    } // getter

//	public void setUserName(String UserName) {		//setter
//		this.UserName = UserName;
//	}  final variables can not be reassigned ==> no need to setter
}
public class TestOverride {


    public static void main(String[] args) {
        final String SSN = "123456"; // local variable
//		 			 SSN = "654321";
//		final variables are constant, and cannot be reassigned
        System.out.println(SSN); // 123456
    }
}
