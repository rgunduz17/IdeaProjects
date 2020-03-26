package day42_OOP_Encapsulation;

public class EmployeeInfo {

		/*
		 Name
		 SSN
		 Age
		 Salary
		 */
	
		private String Name;
		private long SSN;
		private byte Age;
		private double Salary;
		
	// name:
		public void setName(String Name) {
			this.Name = Name;
		}
		
		public String getName() {
			return Name;
		}
		
	// SSN:
		public void setSSN(long SSN) {
			this.SSN = SSN;
		}
		
		public long getSSN() {
			return SSN;
		}
		
	// Age:
		public void setAge(byte Age) {
			this.Age = Age;
		}
		
		public byte getAge() {
			return Age;
		}
		
		
	// Salary:
		public void setSalary(double Salary) {
			this.Salary = Salary;
		}
		
		public double getSalary() {
			return Salary;
		}
	
		
		
	// SetInfo:
		public void setInfo(String Name, long SSN, byte Age, double Salary) {
			setName(Name);
			setSSN(SSN);
			setAge(Age);
			setSalary(Salary);
		}
		
	
}
