package project;
import java.util.Scanner;
public class lowerAndUpperCase_usingInBuiltMethod {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter you String :");
		String str=scn.nextLine();	
		System.out.println("Upper case characters are ");
	for (int i=0;i<str.length();i++) {
		if(Character.isUpperCase(str.charAt(i))) {
			System.out.print(str.charAt(i)+",");
		}
	}
	System.out.println("\nLower case characters are ");
	for (int i=0;i<str.length();i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			System.out.print(str.charAt(i)+",");
			
			Actions
		}
	}
}
}