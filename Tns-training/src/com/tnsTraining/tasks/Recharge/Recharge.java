package com.tnsTraining.tasks.Recharge;
abstract class ReachargeApplicaton{
	final String CompanyName="JIO";
	static int customersCount=0;
	int mobileNumber;
	double amount; 
	
	ReachargeApplicaton(int mobileNumber,double amount){
		this.mobileNumber=mobileNumber;
		this.amount=amount;
		customersCount++;
	}
	
	void displayRecharge() {
		System.out.println("Company Name :"+CompanyName);
		System.out.println("Customer Mobile number :"+mobileNumber);
		System.out.println("Customer Mobile number :"+amount);
		rechargeType();
	}
	abstract void rechargeType();
	
	static void totalCustomers() {
		System.out.println("total customers enrolled : "+customersCount);
	}
}

class prepaid extends ReachargeApplicaton{
	prepaid(int mobileNumber,double amount){
		super(mobileNumber,amount);
	}
	@Override
	void rechargeType() {
		System.out.println("recharge type is prepaid");
	}
}

class postpaid extends ReachargeApplicaton{
	postpaid(int mobileNumber,double amount){
		super(mobileNumber,amount);
	}
	@Override
	void rechargeType() {
		System.out.println("recharge type is postpaid");
	}
}

public class Recharge {

	public static void main(String[] args) {
		prepaid sukumar=new prepaid(938123,299);
		postpaid aishu=new postpaid(62010,399);
		sukumar.displayRecharge();
		sukumar.totalCustomers();
		aishu.displayRecharge();
		aishu.totalCustomers();
		
		// TODO Auto-generated method stub

	}

}
