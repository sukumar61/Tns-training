package com.tnsTraining.taskDay3;
import java.util.Scanner;
public class taskDay3Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int original=number;
		int temp=number;
		int count=0;
		int sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;	
		}
		temp=number;
		while(temp>0) {

            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
		}
		if(original==sum) {
			System.out.print("its a amstrong number");
		}
		else {
			System.out.print("its not a amstrong number");
		}
		
		// TODO Auto-generated method stub

	}

}
