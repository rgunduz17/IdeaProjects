package day38_CustomClassContinue;

public class Employee {
	String Name;
	String ID;
	int age;
	int SSN;
	String JobTitle;
	double salary;
	public Employee(String Name, String ID, int age, int SSN, String JobTitle, double salary) {
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.JobTitle = JobTitle;
		this.salary = salary;
	}
	public void getInfo() {
		System.out.println("Employee name: "+Name);
		System.out.println("Social Security Number: "+SSN);
		System.out.println("Age: "+age);
		System.out.println("Job title: "+JobTitle);
		System.out.println("Employee ID: "+ID);
		System.out.println("Salary: $"+salary);
	}
}
