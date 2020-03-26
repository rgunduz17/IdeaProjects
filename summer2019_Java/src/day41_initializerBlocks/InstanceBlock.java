package day41_initializerBlocks;

public class InstanceBlock {

		{
			System.out.println("instance block1");
		}
		
		{
			System.out.println("instance block3");
		}
		
		{
			System.out.println("instance block2");
		}
		
		public InstanceBlock() {
			System.out.println("Constructor");
		}
		
		
		public static void main(String[] args) {
			
			InstanceBlock obj = new InstanceBlock(); 	// ins cons
			InstanceBlock obj2 = new InstanceBlock(); 	// ins cons ins cons
			InstanceBlock obj3 = new InstanceBlock(); 	// ins cons, ins cons, ins cons
			
		}
	
}
