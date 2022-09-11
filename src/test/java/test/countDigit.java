package test;

import java.util.Scanner;

public class countDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input ");
		int input=sc.nextInt();
		
		int count=0;
		while(input!=0)
		{
			
			
			int rem=input%10;
			count++;
			input=input/10;
			
		}
		System.out.println(count);
	}

}
