package pratice2;

import java.util.Scanner;

public class reverseStringBuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input: ");
		String inputvalue = sc.nextLine();
		StringBuilder sb=new StringBuilder(inputvalue);
		System.out.println(sb.reverse());
		StringBuffer sbuf=new StringBuffer(inputvalue);
		System.out.println(	sbuf.reverse());
	

	}
}
