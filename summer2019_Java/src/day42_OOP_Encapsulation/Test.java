package day42_OOP_Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		TestData obj = new TestData();
		//	System.out.println( obj.Name ); the data was private
		
		System.out.println( obj.getName() ); // read private data only
		
		String str = obj.getName();
		
		//	System.out.println( obj.ID ); // ID is private data
		System.out.println( obj.getID() ); // 
			int a = obj.getID();
			
			
			
	// modify 
		//	obj.getName = "Nurzat";
			obj.setName("Nurzat");
	
		//	System.out.println( obj.Name);
			System.out.println( obj.getName() );	
			
			obj.setID( 400 );
		//	System.out.println(obj.ID );
			System.out.println( obj.getID() );
			
			
			
			
			
			
			
			
			
			
	}
	
}
