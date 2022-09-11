package programs;

public class SeparateAlphbetNoAndSpecialChar {

	public static void main(String[] args) {

		String s="johnnydeep563@gmail.com";
		String alpha="";
		String no="";
		String splChar="";
		
		for(int i=0; i<s.length();i++)
		{
			//if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'){
				
				alpha=alpha+s.charAt(i);
			}
			//else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
				no=no+s.charAt(i);
			}
			else
				
				splChar=splChar+s.charAt(i);
		}
		
		System.out.println(alpha+" "+no+" "+splChar);
	}

}