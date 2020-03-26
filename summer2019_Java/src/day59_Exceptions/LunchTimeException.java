package day59_Exceptions;

public class LunchTimeException extends Exception{

	public LunchTimeException() {
		super("It's Lunch Time");
		System.err.println("Time to stop the class, let's go home");	
	}
	
	
}
