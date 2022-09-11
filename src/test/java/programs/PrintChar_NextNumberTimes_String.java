package programs;

public class PrintChar_NextNumberTimes_String {

	public static void main(String[] args) {
		String s="a2b3c4dr3tt1"; //aabbbcccc
		String empty="";
		
		for (int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z' )&& s.charAt(i+1)>='0'&&s.charAt(i+1)<='9') {
				for (int j = 0; j <s.charAt(i+1)-'0'; j++) {
					empty=empty+s.charAt(i);
				}
			}
		}
		System.out.println(empty);
	}
}