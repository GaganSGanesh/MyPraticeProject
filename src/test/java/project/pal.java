package project;

public class pal {
	public static void main(String [] args) {
		String actual="ITI";
		String rev="";
		for (int i=actual.length()-1;i>=0;i--) {
			rev=rev+actual.charAt(i);
		}
		if(rev.equals(actual)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not A palindrome");
		}
	}

}
