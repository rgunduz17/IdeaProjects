package test;

public class student {
    String name;
    int age;
    String city;
    Long phone;
    String department;


    public student(String name, int age, String city, Long phone, String department) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.department = department;

    }

    public void getDetails(){
        System.out.println(" Student name: "+name +
                            " Age: "+ age+
                            " City: " +city+
                            " Phone number: "+ phone+
                            " Department: "+department);
    }

    public static void main(String[] args) {

        student obj = new student("Ali", 39,"Houston",5555555L,"IT");
         obj.getDetails();
    }
}
