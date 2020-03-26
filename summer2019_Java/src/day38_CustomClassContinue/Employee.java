package day38_CustomClassContinue;

public class Employee {

	
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	
	public Employee(String Name, String ID, int age, int SSN, String JobTitle, double salaary) {
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.JobTitle = JobTitle;
		this.salary = salary;
	}
	
	
	public void getinfo() {
		
		System.out.println("Employee name is: "+Name);
		System.out.println("Social Security Number is: "+SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job title: "+JobTitle);
		System.out.println("Employe ID is: "+ID);
		System.out.println("Salary: "+salary);
		
		System.out.println("-------------------------------------------------");
	}
	
	
	
	
}
