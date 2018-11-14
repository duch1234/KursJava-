package pl.developerpi91.bank;

public class BankAccount implements Account {
	private double balance;
	public final int ACCOUNT_NUMBER;
	
	public BankAccount(double balance, int accountNumber) {
		this.balance = balance;
		this.ACCOUNT_NUMBER = accountNumber;
	}


	public double getBalance() {
		return balance;
	}

	public int getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}



	@Override
	public void deposit(double amount) {
		if(amount<0) {
			throw new IllegalStateException("B�ednie podana wp�at: " + amount + 
					" Warto�c wpa�ty nie moze by� ujemne");
					
		}
		this.balance = this.balance+amount;

	}

	@Override
	public void withdraw(double amount) {
		if(amount<0) {
			throw new IllegalStateException("B�ednie podana wyp��ta: " + amount + 
					" Warto�c nie moze by� ujemne");
					
		}
		this.balance = this.balance  - Math.abs(amount);
	}
	

}
