package test;

import java.util.Scanner;

public class reverseWithInbuiltFunction {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Input");
		String Ip=sc.nextLine();
		
		StringBuilder str=new StringBuilder(Ip);
		System.out.println(str.reverse());
		
	}

}
