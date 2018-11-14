package pl.developerpi91.bank;

public class Bank implements BankTransfer {
	private BankAccount account1 = new BankAccount(1000, 123456789);
	private BankAccount account2 = new BankAccount(1000, 1234);

	public static void main(String[] args) {
		try {
			
		
		Bank bank = new Bank();
		System.out.println(bank.toString());
		
		bank.account1.deposit(1000);
		bank.account2.withdraw(500);
		System.out.println(bank.toString());
		bank.transfer(bank.account1, bank.account2,1000);
		System.out.println(bank.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void transfer(BankAccount from, BankAccount to, int amount) {
		
		if(from.getBalance()<amount+1) {
			System.out.println("not enough balance on account");
			throw new IllegalStateException("Niewystarczajaca ilosc scrodkow!");
//			return;
		}else {
			from.withdraw(amount+1);
			to.deposit(amount);
		}
		
	}

	@Override
	public String toString() {
		return ("Account1 balance: " + account1.getBalance() + "\n" + 
				"Account2 balance: " + account2.getBalance() + "\n");
	}


}
