package day42_OOP_Encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {

        Encapsulate object = new Encapsulate();

        // setting values of the variables
        object.setEmpName("Ridvan");
        object.setEmpSSN(11223344);

        // Displaying values of the variables
        System.out.println("Employee Name: "+ object.getEmpName());
        // Ridvan
        System.out.println("Employee SSN: "+ object.getEmpSSN());
        // 11223344
    }
}
