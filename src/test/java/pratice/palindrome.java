package pratice;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input:");
		String str=input.nextLine();
		String reverse="";
		for (int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(reverse.equals(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
