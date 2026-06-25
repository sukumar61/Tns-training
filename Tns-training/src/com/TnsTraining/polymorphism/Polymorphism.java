package com.TnsTraining.polymorphism;

public class Polymorphism {
	public String eatApple() {
		return("eat one apples");
	}
	public String eatApple(int number) {
		return("eat"+ number+"apples");
	}
	public String eatApple(double number) {
		return("eat"+ number+"apples");
	}
   
	public int  addtion(int number1 ,int number2) {
		return number1+number2;
	}
	public int  addtion(int number1 ,int number2,int number3) {
		return number1+number2+number3;
	}
	public static void main(String[] args) {
		Polymorphism sc=new Polymorphism();
		System.out.println(sc.eatApple());
		System.out.println(sc.eatApple(1));
		System.out.println(sc.eatApple(2));
		System.out.println(sc.addtion(1,2));
		System.out.println(sc.addtion(1,2,3));
		// TODO Auto-generated method stub

	}

}
