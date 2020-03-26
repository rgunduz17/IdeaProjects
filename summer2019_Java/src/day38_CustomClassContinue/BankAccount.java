package day38_CustomClassContinue;

public class BankAccount {

	/*
	 WarmUp:
    create a custom class for BankAccount
    
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
    
        Actions: deposit, withdraw, showBalance
        
        requirements: 
            1. user should be able to deposit money into their account
        
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
            
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            
            3. user should be able to see their balance

	 */
	
		String AccountHolder;
		long AccountNumber;
		double balance;
		
		String username, password;
		
		public  void UserInfo(String username, String password) {
			System.out.println("---------------------------------------------");
			this.username = username;
			this.password = password;

			String psw = ""+password;
			String pass = "*********"+psw.substring(psw.length()-1);
			System.out.println("Account username: "+ username);
			System.out.println("Account password: "+ pass);
			System.out.println("---------------------------------------------");
		}
		
		public BankAccount() {
			
		}
		
		public BankAccount(String AccountHolder, long AccountNumber) {
			this.AccountHolder = AccountHolder;
			this.AccountNumber = AccountNumber;
		}
		
		
		
		
		public void ShowBalance() {
			System.out.println("---------------------------------------------");
			String acct = ""+AccountNumber;
			String AccountNumber = "****-****-****-"+acct.substring(12);
			System.out.println("Account holder: " + AccountHolder);
			System.out.println("Account Number: " + AccountNumber);
			System.out.println("Available Balance: $" + balance);	
			System.out.println("---------------------------------------------");
		}
		
		public void Deposit(double ammount) {
			System.out.println("---------------------------------------------");
			String acct = ""+AccountNumber;
			String AccountNumber = "****-****-****-"+acct.substring(12);
			System.out.println("Depositing $"+ammount+" to account number "+AccountNumber);
			balance+= ammount;
			System.out.println("New Balance: $"+balance);
			System.out.println("---------------------------------------------");
		}

		
		public void Withdraw(double ammount) {
			System.out.println("---------------------------------------------");
			
			if(balance<=0) {
				System.out.println("No available balance");
				return; // exits the method withdraw()
			}
			
			String acct = ""+AccountNumber;
			String AccountNumber = "****-****-****-"+acct.substring(12);
			System.out.println("Withdrawing $"+ammount+" from account number "+AccountNumber);
			balance-=ammount;

			if(balance<0) {
				balance-=35;
			}
			System.out.println("New Balance: $"+balance);

			System.out.println("---------------------------------------------");
		}

		public void accountSetUp(String name, long acctNum) {
			AccountHolder = name;
			AccountNumber = acctNum;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
