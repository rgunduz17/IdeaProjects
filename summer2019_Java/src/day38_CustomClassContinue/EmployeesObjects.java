package day38_CustomClassContinue;

public class EmployeesObjects {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Rahwa", "007", 20, 123456, "CEO", 200000);
			obj1.getInfo();
			
		Employee obj2 = new Employee("Madina", "607487", 20, 4532671, "SDET", 85000);
			obj2.getInfo();
		
		Employee obj3 = new Employee("Ridvan", "12345", 30, 454545,"Software Developer", 110000);
			obj3.getInfo();
	}
	
}
