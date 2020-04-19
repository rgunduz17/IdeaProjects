package day54_Polymorphism;


interface InterFace{
	 void get();
}
interface InterFace2 extends InterFace{
	 void frame();
}
abstract class AbsClass{}
//	   class extends class implements interface/s
public class Test2 extends AbsClass implements InterFace, InterFace2{

	public static void main(String[] args) {
		InterFace obj = new Test2(); // polymorphism
		obj.get();	// chrome
	// referenceType decides what is accessible or can be used
		InterFace2 obj2 = new Test2(); // polymorphism
					obj2.frame(); // frame	
					obj2.get();
					
		AbsClass obj3 = new Test2();
	}
	@Override
	public void get() {
		System.out.println("Chrome browser");
	}

	@Override
	public void frame() {
		System.out.println("frame");
	}
}
