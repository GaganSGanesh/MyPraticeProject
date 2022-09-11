package project;

public class reverseUsingStringFormatter {
	
	public static String reverseString(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		
	}
public static void main(String[] args) {
	System.out.println(reverseString("Lion is the King of Jungle"));
	System.out.println(reverseString("Do we Live in a civilized Society!"));
	
	
}
}


