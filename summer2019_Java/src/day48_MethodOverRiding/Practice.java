package day48_MethodOverRiding;

class WebDriver {
    public void get() {	// this method will be override
        System.out.println("Opens browser");
    } // method with final CANNOT be override
}
final class ChromeBrowser extends WebDriver {
    @Override  // override method
    public void get() {
        System.out.println("Opens chrome browser");
    }

	public final void add(int a, int b) {
		System.out.println(a + b);
	}
	public static double add(double x, double y) {
		return x + y;
	}
}//	methods with final can be overload

public class Practice {
    public static void main(String[] args) {
        ChromeBrowser driver1 = new ChromeBrowser();
        driver1.get(); // Opens chrome browser
    }
}


final class Erhan extends Practice { // immutable

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

















