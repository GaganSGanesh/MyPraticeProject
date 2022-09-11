package programs;

public class Swap1stAndLastWord_String {

	public static void main(String[] args) {

		String s="go goa gone";
		String str[]=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0; i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}

}