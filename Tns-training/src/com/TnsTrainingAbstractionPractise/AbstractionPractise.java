package com.TnsTrainingAbstractionPractise;

interface  Bank{
	String bankName="Aishu's Bank";
	void deposite(int amount);
	void withdraw(int amount);

}


class Customer{
	private String  CustomerName;

	
	Customer(String  CustomerName){
		this.CustomerName=CustomerName;

	}

	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}



}
class AishusBank implements Bank{
	int minumumBalance=2000;
	int maxBalance=10000;
	int currentBalance=2000;

	Customer customer;
	AishusBank(Customer customer){
		this.customer=customer;
	}
	 @Override
	 public void deposite(int amount ) {
		 if(amount+currentBalance>maxBalance) {
			 System.out.println("Transaction failed-higher level transaction");
		 }
		 else {
			 System.out.println("Transaction Succeess");
			 currentBalance +=amount;
			 System.out.println("Current Balance"+currentBalance);
		 }
		// TODO Auto-generated method stub
		
	 }
	 @Override
	 public void withdraw(int amount) {
		 if(amount-currentBalance>minumumBalance) {
			 System.out.println("money Withdrawn");
			
		 }else {

			 System.out.println("cant withdraw money");
		 }
		 

		// TODO Auto-generated method stub
		
	 }
 
}
public class AbstractionPractise {

	public static void main(String[] args) {
		Customer bankCustomer=new Customer("sukumar");
		AishusBank bankoperations=new AishusBank(bankCustomer);
		bankoperations.deposite(6000);
		bankoperations.withdraw(1000);

		// TODO Auto-generated method stub

	}

}
