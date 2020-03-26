package day48_MethodOverRiding;

class Mahribana{
	
	protected void methodA() {	
		// the method we are going to override MUST be inheritable to the sub class
		System.out.println("Mehtod A");
	}
	
	
	public String methodB() {
		return "B";
	}
	
	/*
	public String methodB() {
		return "B";
	}
	*/
	
	
	protected double salary(double bonus) {
		return bonus+10000;
	}
	
}

public class AccessModifiers extends Mahribana{
	/*
	 public double salary(double bonus) {
		return bonus+10000;
	}
	 */
	
	@Override
	public double salary(double bonus) {
		return bonus+20000;
	}
	
	
	/*
	@Override
	private void methodA() {
		System.out.println("Method A");
	}
		override methods access modifiers need to be the same or more visible 
	*/
	
	@Override
	public void methodA() { // same or more visible
		System.out.println("Method A");
	}
	
	@Override
	public String methodB() {
		return "B";
	}
	
	
}
