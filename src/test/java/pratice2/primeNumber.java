package pratice2;

public class primeNumber {
	
	public static void main(String[] args) {
		int no=15;
		boolean flag;
		for (int i=2;i<no;i++) {
			if(no%i==0) {
				 flag = false;
				break;
			}
		}
		if(flag=true)
			 {
				System.out.println("PRIME");
			}
		else {
			System.out.println("Not prime");
		}
		
	}

}
