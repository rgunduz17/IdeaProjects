package day48_MethodOverRiding;

class WebDriver{
	public void get() {
		System.out.println("Opens browser");
	}
	
}

class ChromeBrowser extends WebDriver{
	
	@Override
	public void get() {
		System.out.println("Opens chrome browser");
	}
	
}

class FireFoxDriver extends WebDriver{
	
	@Override
	public void get() {
		System.out.println("Opens firefox browser");
	}
	
	
}


public class Practice {
	
	final static int num2 = 200;
	
	public static void main(String[] args) {
		
		System.out.println(num2); // 0
		
		ChromeBrowser driver1 = new ChromeBrowser();
					driver1.get(); // chrome browser
		
		FireFoxDriver driver2 = new FireFoxDriver();
					driver2.get(); // fire fox browse
		
					
		final int num;
			num = 100;
		//	num = 200; // final variables cannot be reassigned
			
		final String DOB = "11/04/2019";
		//			DOB = "11/05/2019";
		
		
		
	}
	
}


final class Erhan extends Practice{ // immutable

	private final String PassWord = "cybertekbatch12";
	
	public String getPassWord() {
		return PassWord;
	}
	
	/*
	public void setPassWord(String PassWord) {
		this.PassWord = PassWord;
	}
	we cannot generate setter for final variable. final variables are constant
	*/
	
	
	
	
}

















