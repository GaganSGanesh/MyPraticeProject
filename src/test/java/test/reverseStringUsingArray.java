package test;

public class reverseStringUsingArray {
	public static void main(String[] args) {
		String word="String to be reversed";
		char[] str=word.toCharArray();
		for (int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
	}

}
