package pratice2;

import java.util.Scanner;

public class reverse {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Input: ");
	String InputString=sc.nextLine();
	String reverse="";
	for (int i=InputString.length()-1;i>=0;i--) {
		reverse=reverse+InputString.charAt(i);		
	}
	System.out.println(reverse);
}
}
