package com.tnsTraining.taskDay3;
import java.util.Scanner;
public class taskDay3Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    int l=0;
	    int r=str.length()-1;
	    boolean ispalindrom=true;
	    while(l< r) {
	    	if(str.charAt(l)!=str.charAt(r)) {
	    		ispalindrom=false;
	    		break;
	    	}
	    	l++;
	    	r--;
	    }
	    if (ispalindrom) {
	    	System.out.print("its a palindrome");
	    }
	    else {
	    	System.out.print("not a palindrome");
	    }
	    sc.close();
	}
    
}
