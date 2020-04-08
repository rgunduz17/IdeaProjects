package day45_Inheritance;

public class MultiClass {
//		we can create multiple class in java file
//		but we can have only one PUBLIC CLASS
//		Public class name MUST match with Java file name
	public static void main(String[] args) {
		System.out.println("Main public class");
	}
}
class A{ // default access modifier
	public static void main(String[] args) {
		System.out.println("default class A");
	}
}
class B{  // default access modifier
	public static void main(String[] args) {
		System.out.println("default class B");
	}
}

