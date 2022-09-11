package programs;

import java.util.Scanner;

public class CountDigits {

public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int count=0;
		while(a>0)
		{
			int d=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);
				

	}
}