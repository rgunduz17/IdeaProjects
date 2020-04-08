package day43_JavaRecap;

public class LogIn {
    
    public static void main(String[] args) {
        
        Credentials Ftih = new Credentials();
        //  Ftih.username = "Fatih";  // instance variable username is private
        //  Ftih.password = "Чуприна"; // instance variable username is private
            
        //  System.out.println( Ftih.username );
        //  System.out.println( Ftih.password );
        
        // write:
            Ftih.setUsername("fatih");
            Ftih.setPassword("12345");
        //read:
            System.out.println(  Ftih.getUsername()  );
            System.out.println(  Ftih.getPassword() );
        
        
        
    }
}
