package day38_CustomClassContinue;

public class BankAccountObjects {

	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
			account1.AccountHolder = "Erhan Dolapci";
			account1.AccountNumber = 1234567891234567L;
			
			account1.ShowBalance();
			
			account1.Deposit(2000);
			account1.Deposit(4000);
			
			account1.Withdraw(3000);
			account1.Withdraw(3001); // -36
			account1.Withdraw(2000);
			account1.Deposit(2000000);
			
			
		BankAccount account2 = new BankAccount();	
			account2.accountSetUp("Muaz Gulen", 2223333444555666L);
			
			account2.ShowBalance();
		
			account2.Deposit(1000000);
			account2.Withdraw(500000);
		
			
		BankAccount account3 = new BankAccount("Nadire Pilottt", 4004606050503030L);	
			account3.ShowBalance();
			
			account3.Deposit(10);
			account3.Withdraw(20); // -45
			
			account3.Withdraw(200);
			account3.Deposit(3000);
		

		BankAccount account4 = new BankAccount("Ridvan Gunduz", 1234123412341234L);
		account4.ShowBalance();
		account4.UserInfo("RidvanG", "Ridas12345");
		account4.Deposit(4000);
		account4.Withdraw(2000);

	}
	
}
