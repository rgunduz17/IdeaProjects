package day37_classAndObject;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
			System.out.println( dog1.Name ); 
			
			dog1.Breed = "Husky";
			dog1.Size = "Large";
			dog1.Color = "White";
			dog1.Name = "Bucur";
			dog1.Gender = 'F';
			dog1.Age = 2;
			dog1.Food = "Chicken";
			System.out.println( dog1.Breed ); // husky
			
			dog1.getInfo();
		
		
		Dog dog2 = new Dog();
			dog2.Breed = "PitBull";
			dog2.Name = "Lyka";
			dog2.Color = "Gray";
			dog2.Age = 3;
			dog2.Size = "Large";
			dog2.Gender = 'M';
			dog2.Food = "Sushi";
			dog2.getInfo();
			
			dog2.eat();
			
			dog1.eat();
			
			dog1.play();
			dog2.play();
			
			
		//	String str = new String("Hello");
		//		str.toLowerCase();
			
			
			
			
			  /*
		     Assignment:
		        create a custom class for Employees
		            
		                attributes: EmployeeName
		                            EmployeeID
		                            JobTitle
		                            SSN
		                            Gender
		                            Salary
		                            
		                actions:
		                        getInfo
		                        
		                            
		            
		     */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
