package test;

public class fib {
	public static void main(String[] args) {
		int fib=1;
		int fib1=1;
		int fib2;
		for (int i=0;i<=21;i++) {
			fib2=fib+fib1;
			System.out.println(fib2);
			fib=fib1;
			fib1=fib2;
		}
	}

}
