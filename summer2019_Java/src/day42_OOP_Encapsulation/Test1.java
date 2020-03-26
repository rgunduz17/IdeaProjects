package day42_OOP_Encapsulation;

public class Test1 {

	long total = 100;
	
	public Test1() {
		total -= 50;
	}
	
	public Test1(int total) {
		this();
		this.total += total;
	}
	
	{
		total *= 2;
	}
	
	static {
		int total = 20;
		total /= 2;
	}
	
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		System.out.println( obj.total );
	}
	
	
}
