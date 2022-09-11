package project;

public class reversewithusingFunction {
	public static void main(String[] args) {
		String reverse="Iphone";
		String result="";
		for(int i=reverse.length()-1;i>=0;i--) {//check for symbols error i>0 or i<0..
			result=result+reverse.charAt(i);
		}
		System.out.println(result);

		
	}
}
