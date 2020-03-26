package day50_Abstraction;

public class Cat extends Animal{

	public Cat (char Gender, byte Age, String Color, String Nickname) {
		super(Gender, Age, Color, Nickname);
	}
	// Cat mycat = new Cat(Gender, Age, Color, Nickname);

	@Override
	public void Speak(String language) {
		System.out.println(Nickname+" is speaking "+language);
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" is eating "+food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour+" hours");
	}

	@Override
	public void Drink(String drink) {
		System.out.println(Nickname+" drinks "+drink);
	}

	
	
}
