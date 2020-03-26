package day50_Abstraction;

public class Zoo {

	public static void main(String[] args) {
		Cat Cleo = new Cat('F', (byte)5, "Black&White", "Cleo");
	//	System.out.println("NickName is "+Cleo.Nickname ); // Cleo
	//	System.out.println("Gender is "+Cleo.Gender ); //
	//	System.out.println("Color is "+Cleo.Color );
	//	System.out.println("Age is "+Cleo.Age );
		
		System.out.println("================================================");
		Cleo.getinfo();
	
		Cat Misha = new Cat('F', (byte)6, "white", "Misha");
			Misha.getinfo();
			Misha.Sleep(15);
			Misha.Eat("chicken");
			Misha.Drink("milk");
			Misha.Speak("meow");
		
			System.out.println("============================================");
			
		Dog Pongo = new Dog('M', (byte)8, "golden", "Pongo");	
			Pongo.getinfo();
			Pongo.Speak("Ukranian");
			Pongo.Eat("Fish");
			Pongo.Drink("Vodka");
			Pongo.Sleep(7);
			
			System.out.println("============================================");
			
		Dog	Pasha = new Dog('M', (byte)10, "Brown", "Pasha");
			Pasha.getinfo();
			Pasha.Speak("Turkish");
			Pasha.Eat("anything");
			Pasha.Drink("water");
			Pasha.Sleep(8);
			
		System.out.println("================================================");
			
		Dog[] dog = {Pongo, Pasha};
		Cat[] cat = {Misha, Cleo};
			
		dog[1].getinfo();
		
		
		/*
		 
			abstract class: Countries:
						Data: name, flag, language. population, religion, rival
						
						constructor that set all those data
						
					Actions (abstract): exports(parameter), import(parameter), 
										economy(), currency()
										
										
				sub class:	
					South Korea
					USA
					Kazakhistan
					New Zealand
					Mother Russia
					Turkey
					
		 */
		
		
		
		
		
		
		
		
		
		
	}
	
}
