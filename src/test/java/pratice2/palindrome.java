package pratice2;

public class palindrome {
	public static void main (String [] args) {
		String str="kik";
		String rev="";
		for (int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
