package day42_OOP_Encapsulation;

public class Encapsulation {

    private String name;
    // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsulation object = new Encapsulation();
        object.setName("Ridvan"); // setName
        System.out.println(object.getName());  // getName
    }
}

