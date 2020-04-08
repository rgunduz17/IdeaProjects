package day42_OOP_Encapsulation;

public class Encapsulate
{
    // private variables declared
    // these can only be accessed by public methods of class
    private String empName;
    private int empSSN;

    // get method to access private variable
    // GETTERS
    public String getEmpName() {
        return empName;
    }
    public int getEmpSSN() {
        return empSSN;
    }

    // set method to access private variable
    //  SETTERS
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpSSN(int empSSN) {
        this.empSSN = empSSN;
    }
}
