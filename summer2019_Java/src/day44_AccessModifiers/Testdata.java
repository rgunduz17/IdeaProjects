package day44_AccessModifiers;

public class Testdata {

	public static String Name = "Ridvan";
	public static String ID = "007";



	private static String Password = "Cybertek";


	static double salary = 100000; // default access modifier

	protected double number = 123; // protected access modifier

	public static void prtintHello() {
		System.out.println("Hello");
	}

}

