package test;

import java.util.Scanner;

public class palindrome {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		String Enter=sc.nextLine();
		String reverse=""; //note if you initialize with null you wont get value and your string will be added with null+String
		for (int i=Enter.length()-1;i>=0;i--) {
			reverse=reverse+Enter.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(Enter);
		if(reverse.equals(Enter)) {
			System.out.println(Enter+" is palindrome");
		}
		else {
			System.out.println(Enter +" is not palindrome");
		}
	}
}
