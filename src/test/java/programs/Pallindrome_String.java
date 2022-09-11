package programs;

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.nextLine();
		String rev="";
		String temp=s;
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(temp);
		System.out.println(rev);
		if(temp.equals(rev)) {
			System.out.println("pallindrome");
		}
		else
			System.out.println("not");
		
	}

}