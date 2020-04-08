package day41_initializerBlocks;

public class InstanceBlock {

    {
        System.out.println("instance block");
//		THIS IS INSTANCE BLOCK
//		EXECUTE BEFORE CONSTRUCTORS IN ANY CONDITION
    }
	public InstanceBlock() {
//		CONSTRUCTOR
		System.out.println("Constructor");
	}
    public static void main(String[] args) {

        InstanceBlock obj = new InstanceBlock();
//		NEEDS TO CREATE AN OBJECT TO EXECUTE

    }

}
