package day48_MethodOverRiding;

public class Bank {
	
	public void InterestRate() {
		System.out.println("9 percent");
	}
	
	public static void main(String[] args) {
		BankOfAmerica BofA = new BankOfAmerica();
			BofA.InterestRate(); //5
			
		Chase Chase = new Chase();
			Chase.InterestRate(); // 6
		
		CapitalOne CO = new CapitalOne();
			CO.InterestRate(); // 4
		
	}
	
	
}


class BankOfAmerica extends Bank{
	
	public void InterestRate() {
		System.out.println("5 percent");
	}
	
}

class Chase extends Bank{
	
	@Override
	public void InterestRate() {
		System.out.println("6 percent");
	}
	
	
}

class CapitalOne extends Bank{
	
	public void InterestRate() {
		System.out.println("4 percent");
	}
	
	
}
