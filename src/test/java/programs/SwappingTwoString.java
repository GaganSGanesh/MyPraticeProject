package programs;

public class SwappingTwoString {

	public static void main(String[] args) {
		
		String s1= "raj";
		String s2= "shekhar";
		System.out.println("Before swapping: "+s1+" "+s2);
		
		s1=s1+s2;
		System.out.println(s1);
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.print("After swapping: "+s1+" "+s2);
		
	}
}
