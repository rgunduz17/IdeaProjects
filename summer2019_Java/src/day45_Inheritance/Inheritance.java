package day45_Inheritance;

class TestBase{
	
	static String ChromeDriver; 			// default
	
	public static void TakeScreenShot() {	// public
		System.out.println("Took screenshot");
	}
	private static void closeBrowser() {	// private
		System.out.println("Browser closed");
	}

}
//	class Inheritance inherit from TestBase
public class Inheritance extends TestBase{
			//sub				//super
//	 sub class is going to inherit all the visible or
//	 		protected features from the super class
//

	public static void main(String[] args) {
		
		System.out.println(ChromeDriver);
		TakeScreenShot();
	}
}


/*
	Inheritance: Used for building relationship between classes,
			it builds super and sub relationships between classes.

			we use "extends" keyword to build super and sub
				relationships between classes.

			public class  A  extends   B
						sub			 super

			sub class: (child class)
						sub class can inherit the visible and protected
							features from super class.

						features that have public or protected access modifiers:
							can inherited anywhere, even outside the package.

						features that have default access modifiers:
							can only be inherited to the classes that are
								in same package.

						features that have private access modifiers:
							can never be inherited.

			super class:(parent class)
						super class cannot inherit any feature
							from the sub class.

 */

//  		benefits of inheritance:
//						1. Reusability
//						2. Easy to maintain
//						3. Data hiding
//						4. Overriding