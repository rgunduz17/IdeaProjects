package day48_MethodOverRiding;

class student{
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethodOverriding extends student{
	//			sub						super

	public void print(String str) {
		
	} //method overloading
	
	public void print(double a) {
		
	}  //method overloading
	
	//	public void print(String str) {} // overriding cannot happen in the same class

	public void printName() {
		System.out.println("Sukran");
	} // method overriding
	
	public static void main(String[] args) {

		student obj2 = new student();
				obj2.printName(); // Hakan
		
		MethodOverriding obj = new MethodOverriding();
				obj.printName(); // Sukran
	}


//		Method Overriding:
//					Same name, same parameter, implementation is different
//					Only instance method can be overridden
//					Constructor and static, private methods cannot be overridden
//					Return type MUST be same
//					Override methods' access modifier need to be same or more visible
//						default   ==> 	default, protected, public
//						protected ==> 	protected, public
//						public    ==> 	public
//
//					public > protected > default > private
//
//					to implement specific functionality to the method
//						we create methods with same name and same parameter,
//							then provide different implementation

//		@override: used to verify if the method is overridden or not
//
//		Example:  		Webdriver driver = new chromeDriver();
//						driver.get("URL"):	goes to the URL in chrome browser
//
//						Webdriver driver = new FireFoxDriver();
//  					driver.get("URL"):	goes to the URL in firefox browser
//
//						same method but different functionality
//
//	 	override benefits:
//						readable, reusable, flexible
//
//

//				method overriding  					VS 				method overloading
//
//
//			OVERLOAD:
//					method name MUST be same
//					access modifier can be same or different
//					return type can be same or different
//					parameters MUST be same
//					can happen in the same class

//			OVERRIDE:
//					Access modifier can be same or more visible
//					overriding CANNOT happen in the same class
//					method MUST be inheritable to the sub class
//					return type MUST be same
//					method name MUST be same
//					parameters MUST be same
//					@Override annotation MUST be applicable





}
