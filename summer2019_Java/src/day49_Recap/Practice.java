package day49_Recap;

abstract class shape{
	
	public abstract void Area();
	
}

abstract class T extends shape{
	
}

// concrete
class triangle extends shape{
	
	public void Area() {
		System.out.println("Area of the triangle is...");
	}
	
	
}



public class Practice {

}
