package day38_CustomClassContinue;

// Class Declaration
public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
    // Constructor Declaration of Class
    public Dog(String name, String breed,
               int age, String color)
    {    //  instance variable          local variable(String name)
          this.name          =          name;
        this.breed = breed;           // to assign instance variable to
        this.age = age;               //   local variable use this keyword
        this.color = color;           //   (if both has SAME name )
    }
    public static void main(String[] args)
    {
//      creation of an object
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.getInfo());  // calling class with object name
    }

    public String getInfo()
    {
        return("Hi my name is "+ name+ ".\nMy breed, age and color are: " +
                breed+", " + age+ ", "+ color);
    }
}
