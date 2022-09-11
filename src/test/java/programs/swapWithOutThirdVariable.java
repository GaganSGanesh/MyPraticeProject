package programs;

public class swapWithOutThirdVariable {
	public static void main(String[] args) {
		int no=10;
		int no1=20;
		no=no+no1;
		no1=no-no1;
		no=no-no1;
		System.out.println(no);
		System.out.println(no1);
	}

}
