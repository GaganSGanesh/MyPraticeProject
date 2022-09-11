package programs;

import java.util.Scanner;

public class reverseStringUsingInbuiltFunctions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input :");
		String str=scan.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		//index for builder starts from 1
		System.out.println(sb.replace(0, 3, "TooT"));
	}

}
