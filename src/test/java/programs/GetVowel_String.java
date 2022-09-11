package programs;

public class GetVowel_String {

	public static void main(String[] args) {
		
		String s1="RAJ shekhar";
		String s2=s1.toLowerCase();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u')
			{
				System.out.println(s2.charAt(i));
			}
		}
	}
}