package entities;

public class Bank {

	private final int accountNumber; 
	private String user;
	private double account;
	
	public Bank(int accountNumber, String user) {
		this.accountNumber = accountNumber;
		this.user = user;
		
	}
	
	public Bank(int accountNumber, String user, double account) {
		this.accountNumber = accountNumber;
		this.user = user;
		deposit(account);
	}

	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getAccount() {
		return account;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double value) {
		account += value;
	}
	
	public void withdraw(double value) {
		account -= value + 5;
	}
	
	public String toString() {
		String text = "Account " + accountNumber + ", Holder: " + user + ", Balance: $ " + String.format("%.2f", account);

		return text;
	}
	
}
