package day45_Inheritance;

class TestBase{
	
	static String ChromeDriver; // default
	
	public static void TakeScreenSchot() {
		System.out.println("Took screenshot");
	}
	
	private static void closeBrowser() {
		System.out.println("Browser closed");
	}

	
}

public class Inheritance extends TestBase{
			//sub				//super
	// sub class is going to inherit all the visible protected features from the super class
	
	/*
	 static String chromeDriver;
	 
	 public static void TakeScreenSchot() {
		System.out.println("Took screenshot");
	}
	 */
	
	public static void main(String[] args) {
		
		System.out.println(ChromeDriver);
		TakeScreenSchot();
		
	}
	
}
