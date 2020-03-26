package day50_Abstraction;

public class Dog extends Animal{

	public Dog(char Gender, byte Age, String Color, String Nickname) {
		super(Gender, Age, Color, Nickname);
	}

	
	// Dog obj = new Dog('F', 5 "Red", "Ace");
	
	@Override
	public void Speak(String language) {
		System.out.println(Nickname+" speaks "+language+" language");
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" eats "+food);
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
