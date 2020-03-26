package day48_MethodOverRiding;

class Credentials{
	
	private final String UserName = "cybertek";
	private final String PassWord = "12321";
	
	
	public String getUsername() {
		return UserName;
	}
	
	/*
	public void setUserName(String UserName) {
		this.UserName = UserName;
		// final variables can not be reassigned
	}
	*/
}


class Holly{

	public void printName() {
		System.err.println("Erhan");
	}
	
	
	
}


public class FinalKeyword extends Holly{

	@Override
	public void printName() {
		System.err.println("Madina");
	}
	
	
		final int AGE = 100;
	
	public static void main(String[] args) {
		
		final String SSN = "123456";
		// SSN = "654321"; 
			// final variables are constant, and cannot be reassigned
		
		System.out.println(SSN);
///////////////////////////////////////////////////////////////////////////
		final String DateOfBirth;
			DateOfBirth = "";
		System.out.println(DateOfBirth);
//////////////////////////////////////////////////////////////////////////	
		FinalKeyword obj = new FinalKeyword();
		
		System.out.println( obj.AGE );
		
		
	}
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double add(double x, double y) {
		return x+y;
	}
	
	
	
	
}
