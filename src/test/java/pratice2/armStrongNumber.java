package pratice2;

public class armStrongNumber {
	public static void main(String[] args) {
		int no=153;
		int arm=0;
		int copy=no;//it is must else result is not showed
		while(no!=0) {
			int rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		if(arm==copy) {
			System.out.println("Arm Strong Number");
		}
	}

}
