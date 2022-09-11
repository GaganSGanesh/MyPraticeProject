package programs;

import java.util.Scanner;

public class reverseStringWithDynamicInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Input:");
		String str=scan.nextLine();
		String reversed="";
		for (int i=str.length()-1;i>=0;i--) {
			reversed=reversed+str.charAt(i);
		}
		System.out.println(reversed);
	}

}
