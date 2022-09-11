package test;

public class SumOfNumberInString {
	public static void main(String[] args) {
		String word="Gagan1995";
		int sum = 0;
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)>='1' && word.charAt(i)<='9') {
				sum=sum+word.charAt(i)-'0';
			}
		}
		System.out.println(sum);
	}

}
