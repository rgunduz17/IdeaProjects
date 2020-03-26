package day42_OOP_Encapsulation;

public class TestData {

		/*
		 Name
		 ID
		 */
		
		private String Name = "Enes"; // data is not visible or accessible to other classes
		private int ID = 200;
		
	// getter: Read the data	
		public String getName() { // read the private data only
			return Name;
		}
		
		public int getID() {
			return ID;
		}
		
		
	// setter: to modify the data	
		public void setName(String Name) {
			this.Name = Name;
		}
	
		public void setID(int ID) {
			this.ID=ID;
		}
	
}
