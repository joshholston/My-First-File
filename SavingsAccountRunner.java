/**
 * Author: Josh Holston
 * Date: 2/5/22
 * File: SavingsAccountRunner.java
 * Description: This is the main file for the Savings Account programs that we actually run
 */
	import java.util.Scanner;
	import java.util.*;

public class SavingsAccountRunner {
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		int id;
		double balance;
		double annualIntRate;
		double deposit;
		int selection;

		System.out.println("*****************************************");
		System.out.println("=== Welcome to the MidFirst Bank ATM! ===");
		System.out.println("*****************************************\n");

		SavingsAccount SavingsAccount = new SavingsAccount();
		
		// sets the account id
		System.out.print("Enter your Account ID: ");
		id = input.nextInt();
		SavingsAccount.setId(id);
		
		//sets the account balance
		System.out.print("Enter your Account Balance: ");
		balance = input.nextDouble();
		SavingsAccount.setBalance(balance);
		
		// sets the interest rate
		System.out.print("Enter the Annual Interest Rate: ");
		annualIntRate = input.nextDouble();
		SavingsAccount.setAnnualIntRate(annualIntRate);
		
		// prints out option menu
		do {
		
				System.out.println("\n*****************************************");
				System.out.println("============== Option Menu ==============");
				System.out.println("*****************************************");
		
				System.out.println("1 : Deposit");
				System.out.println("2 : View Weekly Interest Rate");
				System.out.println("3 : View Account Details");
				System.out.println("4 : Exit");
				System.out.print("\nPlease select an option: ");
					selection = input.nextInt();
			
			// gets the user input for what option to show
			while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
				System.out.print("Invalid option, please enter a valid integer: ");
				selection = input.nextInt();
			}
				// Deposit
				if (selection == 1) {
					System.out.print("\nPlease enter your deposit amount: ");
					deposit = input.nextDouble();
					while(deposit < 1) {
						System.out.print("Invalid amount, please enter a positive number: ");
						deposit = input.nextDouble();
					}
					SavingsAccount.setDeposit(deposit);
			
					System.out.printf("New Account Balance: $%.2f", SavingsAccount.getDeposit());
				}
				
				// View Weekly Interest 
				if (selection == 2) {
					System.out.printf("Your Weekly Interest amount is: $%.2f\n", SavingsAccount.getWeeklyIntRate());
				}
				
				// View Account Details
				if (selection == 3) {
					System.out.println("Date Created: " + SavingsAccount.getDate());
					System.out.println("Account ID: " + SavingsAccount.getId());
					System.out.printf("Account Balance: $%.2f\n", SavingsAccount.getBalance());
					System.out.printf("Account Weekly Interest Rate: $%.2f\n", SavingsAccount.getWeeklyIntRate());
				}
				
				// Exit
				if (selection == 4) {
					System.out.println("\n**************************************************");
					System.out.println("=== Thank you for using the MidFirst Bank ATM! ===");
					System.out.println("**************************************************\n");
				}
		//continues the loop for the option menu until 4 is selected to exit
		} while(selection != 4);
			
		
		

		// closes scanner
		input.close();

	}
}
