package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposit;
		
		System.out.println("Enter account number:");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder:");
		String user = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char resposta = sc.next().charAt(0);
		
		Bank bank = new Bank(accountNumber, user);
		
		if(resposta == 'y') {
			
			System.out.println("Enter initial deposit value:");
			deposit = sc.nextDouble();
			bank = new Bank(accountNumber, user, deposit);
			
		}
		
		System.out.println("account data:");
		System.out.println(bank);
		
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		bank.deposit(deposit);

		System.out.println("Updated account data:");
		System.out.println(bank);
		
		System.out.println("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		bank.withdraw(deposit);

		System.out.println("Updated account data:");
		System.out.println(bank);
		
		
		
		
		
		
		sc.close();
		
	}
	
}
