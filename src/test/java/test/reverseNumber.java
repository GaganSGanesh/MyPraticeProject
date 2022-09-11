package test;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String [] args) {
		int reversed = 0;
		int number=123;
		
		while(number!=0) {
			int rem=number%10;
			 reversed=reversed*10+rem;
			number=number/10;
		}
		System.out.println(reversed);
	}

}
