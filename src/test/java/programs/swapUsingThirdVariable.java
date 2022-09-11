package programs;

public class swapUsingThirdVariable {
	public static void main(String[] args) {
		
	String str="new";
	String str2="old";
	String str3="";
	str3=str2;
	str2=str;
	str=str3;
	System.out.println(str);
	System.out.println(str2);
	}

}
