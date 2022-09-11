package programs;

import java.util.Scanner;

public class ReverseNo {

public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no ");
		int a=s.nextInt();
		int rev=0;
		
		while(a>0)
		{
			int d= a%10;
		    rev=rev*10+d;
			a=a/10;
			System.out.println(rev);
		}
		//System.out.println(rev);

	}
}