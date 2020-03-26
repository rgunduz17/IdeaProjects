package day44_AccessModifiers;

public class Testdata {

	public static String Name = "Juline";
	public static String ID = "007";
	public static String SchoolName = "Cybertek";
	public static int age = 20; // access modifier is default
	
	
	private static String Password = "Cybertek";
	
		
	static double salary = 100000; // default access modifier
	
	protected double number = 123; // protected access modifier 
	
	public static void prtintHello() {
		System.out.println("Hello");
	}
	
	
}
