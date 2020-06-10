package test;

public class BankAccount2 {
    public long acoountNumber;
    public String accountHolder;
    public double balance;
    public void deposit(double amount){
        balance += amount;
    }
    public void showBalance(){
        System.out.println("Balance: "+balance);
    }
    public String toString(){
        return "Client "+accountHolder+" has the amount of $"+balance+" under the account number"+acoountNumber;
    }
}

class SavingAccount extends BankAccount2 {
    public double interestRate;
}
class CheckingAccount extends BankAccount2 {
    public void withDraw(int amount){
        balance -= amount;
    }

    class BankAccountObject extends BankAccount2{

    }
}
