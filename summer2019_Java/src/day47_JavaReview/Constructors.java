package day47_JavaReview;


class Mehmet{
    
    public Mehmet() {
        System.out.println("Mehmet");
    }
    
}
class Resul extends Mehmet{
    
    public Resul() {
        //supert()  // Mehmet
        System.out.println("Resul");
    }
    
}
class Viktoria extends Resul {
    
    public Viktoria() {
        super();
        System.out.println("Viktoria");
    }
    
}
public class Constructors {
    
    public static void main(String[] args) {
        
        Viktoria obj = new Viktoria();
        
        
    }
}
