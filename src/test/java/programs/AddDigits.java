package programs;

import java.util.Scanner;

public class AddDigits {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=s.nextInt();
		int sum=0;
		while(a>0)
		{
			int d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println(sum);
     
	}

}