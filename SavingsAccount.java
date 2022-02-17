/**
 * Author: Josh Holston
 * Date: 2/5/22
 * File: SavingsAccount.java
 * Description: This java file contains the getter and setters for the SavingsAccountRunner.java file
 */

import java.util.*;
	
public class SavingsAccount {
		
		private int id;
		private double balance;
		private double annualIntRate;
		private double weeklyIntRate;
		private double deposit;
		private Date accountCreationDate;
		
		public SavingsAccount() {
			
		}

		public SavingsAccount(int id, double balance, double annualIntRate) {
			this.id = id;
			this.balance = balance;
			this.annualIntRate = annualIntRate;
		}

		// getters, accessors
		
		public int getId() {
			return id;
		}
		public double getBalance() {
			return balance;
		}
		public double getAnnualIntRate() {
			annualIntRate /= 100;
			return annualIntRate;
		}
		public double getWeeklyIntRate() {
			weeklyIntRate = (annualIntRate / 100) / 52;
			weeklyIntRate *= balance;
			return weeklyIntRate;
		}
		public double getDeposit() {
			balance += deposit;
			return balance;
		}
		public Date getDate() {
			// I couldn't figure out how to make it so that the date variable
			// wouldn't change every time that the 3 option was selected
		    Date accountCreationDate = new Date();
		    this.accountCreationDate = accountCreationDate;
			return this.accountCreationDate;
		}
					
				
		// setters, mutators
				
		public void setId(int id) {
			this.id = id;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setAnnualIntRate(double annualIntRate) {
			this.annualIntRate = annualIntRate;
		}
		public void setDeposit(double deposit) {
			this.deposit = deposit;
		}		

}
