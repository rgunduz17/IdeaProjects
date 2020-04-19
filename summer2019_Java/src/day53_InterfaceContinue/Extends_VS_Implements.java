package day53_InterfaceContinue;

interface B{
	void method3();
}
public interface Extends_VS_Implements extends B{
					// subtype 				supertype
	void method1(); //public abstract
	void method2(); //public abstract
//	void method3();	 inherited from interface B
}

class A implements Extends_VS_Implements{
	@Override
	public void method1() {
		
	}
	@Override
	public void method2() {
		
	}
	@Override
	public void method3() {
		
	}
}
class C extends A implements Extends_VS_Implements{
// class extends class implements interface/s
}


