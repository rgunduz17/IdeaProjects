package day42_OOP_Encapsulation;

public class AmericanAirline {

	public static void main(String[] args) {
	
		EmployeeInfo emrah = new EmployeeInfo();
			//	emrah.Name = "Emrah"; // private data is not visible outside of its class
			emrah.setName("Emrah");
			
		// System.out.println(emrah.Name );// you need to use getter to get the private data
		  
			System.out.println( emrah.getName() ); // Emrah
			
			emrah.setSSN( 12345646 );
			System.out.println( emrah.getSSN() );

			emrah.setAge( (byte) 20 );
			System.out.println( emrah.getAge() );
	
			emrah.setSalary(120000);
			System.out.println( emrah.getSalary() );
			
			System.out.println("=====================================");
			
		EmployeeInfo Shirin = new EmployeeInfo();
			Shirin.setName("Shirin");
			Shirin.setAge( (byte) 20 );
			Shirin.setSSN(77777);
			Shirin.setSalary( 2 );
			
		System.out.println( Shirin.getName() );
		System.out.println( Shirin.getSSN() );
		System.out.println( Shirin.getAge() );
		System.out.println( Shirin.getSalary() );	
		
		System.out.println("========================================");
		
			
		EmployeeInfo Rohan = new EmployeeInfo();
				Rohan.setInfo("Rohan", 3215672, (byte)20 , 150000);
				
//				System.out.println( Rohan.getName() );
//				System.out.println( Rohan.getSSN() );
//				System.out.println( Rohan.getSalary() );
//				System.out.println( Rohan.getAge() );

				Rohan.getInfo("Rohan", 3215672, (byte)20 , 150000);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
