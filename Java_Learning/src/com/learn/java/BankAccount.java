package com.learn.java;

//Class = data + method(functions) Bank = (Acc No,Name,Balance) + (Debit, deposite, Transfer)
public class BankAccount
{
	// wrapper Class - Long class using ending point we should give "l" for using long class
	Long AccountNumber = 12345678l;
	//Wrapper Class - String class using
	String AccountName = "Sathishkumar J";
	//Wrapper Class - Integer class using
	Integer AccountBalance = 100;
	
	public void GetAccountBalance() { 		System.out.println("Your Account Balance is " + AccountBalance); 	}	
	public void GetAccountName() 	{		System.out.println("The Account Holder name is " + AccountName); 	}
	public void GetAccountNumber() 	{		System.out.println("The account number is" + AccountNumber); 		}
	
	//Main entry point 
	public static void main(String[] args) 
	{
		BankAccount bank = new BankAccount();
		bank.GetAccountBalance();
		bank.GetAccountName();
		bank.GetAccountNumber();
	}

}
