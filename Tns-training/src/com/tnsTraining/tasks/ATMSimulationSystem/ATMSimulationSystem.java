package com.tnsTraining.tasks.ATMSimulationSystem;
import java.util.Scanner;

abstract class Account{
	final String bankName="SBI";
	protected double accountNumber;
	protected String accountHolder;
	protected int pin;
	protected double balance;
	
	Account(double accountNumber,String accountHolder,int pin,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.pin=pin;
		this.balance=balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void displayBalance();
}

class SavingsAccount extends Account{
	static int totalTransactions=0;
	SavingsAccount(double accountNumber,String accountHolder,int pin,double balance){
		super(accountNumber,accountHolder,pin,balance);
		totalTransactions++;
	}
	@Override
	void deposit(double amount) {
		balance +=amount;
	}
	@Override
	void withdraw(double amount) {
		if (amount>balance) {
			System.out.println("Insuffiecnt Founds");
		}else {
			balance -=amount;
			System.out.println("Amount Withdrawn : "+amount);
			System.out.println("Balance Amount : "+balance);
		}
	}
	@Override
	void displayBalance() {
		System.out.println("ACCOUNT NUMBER : "+accountNumber);
		System.out.println("Amount in Account : "+balance);
	}
	
	
}
public class ATMSimulationSystem {

	public static void main(String[] args) {
		SavingsAccount atmInterface=new SavingsAccount(123456,"aishu",1234,10000);
		System.out.println("HI CUSTOMER WELCOME TO ATM");
		System.out.println("please enter account number and pin");
		Scanner sc= new Scanner(System.in);
		double accountNum=sc.nextInt();
		int PinNum=sc.nextInt();
		if(accountNum==atmInterface.accountNumber &&PinNum==atmInterface.pin) {
			System.out.println("HI USER : "+atmInterface.accountHolder);
			System.out.println("Please Choose the below options");
			int choice;
			
			do {
				System.out.println("MENU ");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Total Transactions");
                System.out.println("5. Exit");

                System.out.print("Enter Choice : ");
                choice=sc.nextInt();
                
                switch(choice) {
                
                case 1:
                	atmInterface.displayBalance();
                	break;
                case 2:
                	double amount=sc.nextInt();
                	atmInterface.deposit(amount);
                	break;
                case 3:
                	double withDrawamount=sc.nextInt();
                	atmInterface.withdraw(withDrawamount);
                	break;
                case 4:
                	System.out.println("Total Transactions : " + SavingsAccount.totalTransactions);
                	break;
                case 5:
                	System.out.println("THANKS FOR VISTING OUR ATM");
                	break;
                default:
                    System.out.println("Invalid Choice");
                }
			}while(choice !=5);	
		}else {
			System.out.println("Invalid Account Number or PIN");
		}
		sc.close();

		
		// TODO Auto-generated method stub

	}

}
