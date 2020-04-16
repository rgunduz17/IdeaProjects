package day49_Recap;
// abstract class
public abstract class Animal {
    // abstract methods
    public abstract void eat();
    
    public abstract void sleep();   
    
    public static void main(String[] args) {
        
    }
}
// concrete
class Cat extends Animal {
    
    @Override
    public void eat() {
        System.out.println("cat eats fish");
    }
    
    @Override
    public void sleep() {
        System.out.println("cat sleeps 14 hours");
    }   
}
 class KingKong extends Animal{
    @Override
     public void eat() {
         System.out.println("king kong eats Humans");
     }
     
    @Override
     public void sleep() {
         System.out.println("King kong sleeps 5 hours");
     }
    
}
 
 class Test{
     
     public static void main(String[] args) {
         KingKong obj = new KingKong();
         obj.eat();
         
         Cat obj2 = new Cat();
            obj2.eat();
            
         
    }
     
     
 }
