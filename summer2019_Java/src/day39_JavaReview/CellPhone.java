package day39_JavaReview;

public class CellPhone {

	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhone() { // set up default values for the attributes of the class
		brand = "Iphone";
		model = "10";
		screensize = 5.8;
		color = "White";
		price = 600;
	}
	
	public CellPhone(String brand, String model, double screensize, String color, double price ) {
		this.brand = brand;
		this.model = model;
		this.screensize = screensize;
		this.color = color;
		this.price = price;
	}
	
	public void call(long PhoneNumber) {
		System.out.println(brand+" "+model+" is calling ..");
	}
	
	public void SendMessage(long PhoneNumber) {
		System.out.println("Sending messages to "+PhoneNumber);
	}
	
	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+"in $"+ price);
	}
	
	
	
	
	
	
	
	
	
	
}
