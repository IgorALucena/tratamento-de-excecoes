package program;

import java.util.Locale;
import java.util.Scanner;

import model.AccountEntities;
import model.AccountExceptions;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String holder;
		double balance, withdrawLimit;

		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Inicial balance: ");
		balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		withdrawLimit = sc.nextDouble();
		
		AccountEntities ae = new AccountEntities (number, holder, balance, withdrawLimit);
		
		System.out.println();
		double amount = 0.0;
		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		
		try {
				ae.withDraw(amount);
				System.out.println(ae);
		}
		
		catch(AccountExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		
		sc.close();
	}

}
