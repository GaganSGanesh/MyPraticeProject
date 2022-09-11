package test;

import java.util.Scanner;

public class getowels {
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter input :");
		String newstr=str.nextLine();
		String ActualString=newstr.toLowerCase();
		int count=0;
		for (int i=0;i<newstr.length();i++) {
			if(newstr.charAt(i)=='a' || newstr.charAt(i)=='e'|| newstr.charAt(i)=='i'|| newstr.charAt(i)=='o'|| newstr.charAt(i)=='u')
			{
				count++;
			 System.out.println(newstr.charAt(i));	
			}
		}
		System.out.println("TOTAL OVWELS ARE "+ count );
	}
}
