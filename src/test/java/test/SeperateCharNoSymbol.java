package test;

public class SeperateCharNoSymbol {
	public static void main(String[] args) {
		
	String str="Jinchurike19!@#$";
	
	String ch="";
	String no="";
	String symbol="";

	for(int i=0;i<str.length()-1;i++) {
		
		//if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122 )
		if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' )
		{
			ch=ch+str.charAt(i);
		}
//				else if(str.charAt(i)>='0' && str.charAt(i)<='9')
		else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			no=no+str.charAt(i);
		}
		else {
			symbol=symbol+str.charAt(i);
		}	
	}
	System.out.println("characters ="+ch);
	System.out.println("number ="+no);
	System.out.println("symbol ="+symbol);
}
}