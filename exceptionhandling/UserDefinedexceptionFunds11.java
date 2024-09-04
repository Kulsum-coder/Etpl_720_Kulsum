package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class UserDefinedexceptionFunds11 {
	public static void withdraw(double amount )throws InsufficientFundsException{
		double balance=500.00;
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawl");	
		}
		else {
			System.out.println("withdraw succeful");	
		}
	}
		public static void main(String[] args) {
			try {
				withdraw(600.00);	
			}
			catch(InsufficientFundsException e) {
				System.out.println("caught exception :"+e.getMessage());
				System.out.println(e);	
			}	
		}
	}


