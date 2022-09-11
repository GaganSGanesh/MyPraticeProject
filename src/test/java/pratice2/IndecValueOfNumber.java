package pratice2;

public class IndecValueOfNumber {
	public static void main(String[] args) {
		int num []= {10,20,30,40,50};
		int find=30;
		for (int i=0;i<num.length;i++) {
			if(num[i]==find) {
				System.out.println(i);
			}
		}
	}

}
