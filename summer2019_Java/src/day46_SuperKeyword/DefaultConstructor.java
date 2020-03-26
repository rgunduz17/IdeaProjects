package day46_SuperKeyword;

class B{

	public B(int a) {
		System.out.println("super");
	}
}

public class DefaultConstructor extends B{
//					sub					super
	
	public DefaultConstructor() {
		super(10);		//super
		System.out.println("Sub"); //sub
	}
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		
		
	}
	
}
