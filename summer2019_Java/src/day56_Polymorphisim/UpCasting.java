package day56_Polymorphisim;

class Animal{
	
	public void method1() {
		
	}
}
class Dog extends Animal{
		// DOG IS An Animal
	public void method2() {
		
	}
}
public class UpCasting {
	public static void main(String[] args) {
		// Primitive Casting
		System.out.println( (double)10 );
		
		// UpCasting: casting subclass to superior type
		Dog obj = new Dog(); //
		Animal obj2 = (Animal)obj; //UPCASTING

		Animal obj3 = new Animal();
		Dog obj4 = (Dog)obj3; // DOWNCASTING
	}
}

//		there are two type of casting:
//				1. Upcasting 2. Downcasting
//	UPCASTING:
//			If classes have "IS A" relationship UPCASTING is allowed
//			Converting sub type to super type

