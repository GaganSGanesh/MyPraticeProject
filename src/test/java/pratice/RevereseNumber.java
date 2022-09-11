package pratice;

public class RevereseNumber {
	public static void main(String[] args) {
		
	int no=123;
	int reversed = 0;
	while(no!=0) {
		//divide and multiply by 10
		int rem=no%10;
		reversed=reversed*10+rem;
		no=no/10;
	}
	System.out.println(reversed);
	}
}
