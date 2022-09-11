package pratice2;

public class sepereateCharacterNumber {
	public static void main(String[] args) {
		String value="GaganSG99555$#@%";
		String Input = value.toLowerCase();
		String alpha="";
		String no="";
		String speciaLChar="";
		
		for(int i=0;i<Input.length();i++) {
			if(Input.charAt(i)>='a'&& Input.charAt(i)<='z' ) {
				 alpha=alpha+Input.charAt(i);
			}
			else if(Input.charAt(i)>='0' && Input.charAt(i)<='9' ) {
				no=no+Input.charAt(i);
			}
			else {
				speciaLChar=speciaLChar+Input.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(no);
		System.out.println(speciaLChar);
		
	}

}
