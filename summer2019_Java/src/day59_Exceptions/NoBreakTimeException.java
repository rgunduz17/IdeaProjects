package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException {

	public NoBreakTimeException() {
		
		super("Too mcuh break ocurred in java course");
		System.err.println("There is no break till we get the job done");
	}
	
}
